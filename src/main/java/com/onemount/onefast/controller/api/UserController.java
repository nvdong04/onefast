package com.onemount.onefast.controller.api;

import com.onemount.onefast.model.User;
import com.onemount.onefast.dto.response.UserResponse;
import com.onemount.onefast.service.SecurityService;
import com.onemount.onefast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "api/private/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;


    @GetMapping
    public ResponseEntity<UserResponse> getCurrentUser() {
        User currentUser = securityService.getCurrentUser();
        UserResponse userResponse = new UserResponse();
        userResponse.setEmail(currentUser.getEmail());
        userResponse.setFullname(currentUser.getFullname());
        userResponse.setPhone(currentUser.getPhone());
        userResponse.setRole(currentUser.getRoles().stream().map(role -> role.getName()).collect(Collectors.toList()));
        return ResponseEntity.ok().body(userResponse);
    }

}
