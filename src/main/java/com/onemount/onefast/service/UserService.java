package com.onemount.onefast.service;

import com.onemount.onefast.dto.UserDTO;
import com.onemount.onefast.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService extends UserDetailsService{
    User findById(Long id);
    User findByEmail(String email);
    boolean emailExisted(String email);
    void createUser(UserDTO userDTO);
}
