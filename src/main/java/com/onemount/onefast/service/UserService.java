package com.onemount.onefast.service;

import com.onemount.onefast.dto.UserDTO;
import com.onemount.onefast.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService{
    User findById(Long id);
    boolean emailExisted(String email);
    void createUser(UserDTO userDTO);
}
