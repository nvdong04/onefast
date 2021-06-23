package com.onemount.onefast.service;

import java.util.*;
import java.util.stream.Collectors;

import com.onemount.onefast.dto.MyUser;
import com.onemount.onefast.dto.UserDTO;
import com.onemount.onefast.model.Role;
import com.onemount.onefast.model.User;
import com.onemount.onefast.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = null;
        try{
            user = userRepository.findByEmail(email).orElseThrow();
        } catch (Exception e){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        MyUser myUser = new MyUser(user.getEmail(),user.getPassword(), mapRolesToAuthorities(user.getRoles()));
        myUser.setEmail(user.getEmail());
        myUser.setFullname(user.getFullname());
        return myUser;
    }

    @Override
    public User findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("Email not found!")
        );
    }

    @Override
    public boolean emailExisted(String email) {
        return userRepository.existsByEmail(email);
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void createUser(UserDTO userDTO) {
       User user = new User();
       user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
       user.setFullname(userDTO.getFullname());
       user.setEmail(userDTO.getEmail());
       user.setActive(true);
       user.setRoles(Collections.singletonList(roleService.getRoleByName(userDTO.getRole())));
       Date now = Calendar.getInstance().getTime();
       user.setCreatedAt(now);
       user.setModifiedAt(now);
       userRepository.save(user);
    }
    
}
