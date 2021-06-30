package com.onemount.onefast.controller.api;

import com.onemount.onefast.config.JwtTokenUtil;
import com.onemount.onefast.dto.MyUser;
import com.onemount.onefast.dto.request.JWTRequest;
import com.onemount.onefast.dto.response.JWTResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "")
public class HomeController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    public String root() {
        return "Welcome!";
    }

    @PostMapping("/login")
    public ResponseEntity<JWTResponse> login(@RequestBody @Valid JWTRequest request) {
        try {
            Authentication authenticate = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

            MyUser user = (MyUser) authenticate.getPrincipal();

            return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, jwtTokenUtil.generateToken(user))
                    .body(new JWTResponse(jwtTokenUtil.generateToken(user),"Bearer"));
        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}
