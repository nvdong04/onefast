package com.onemount.onefast.config;
import java.util.ArrayList;
import java.util.Collection;

import com.onemount.onefast.dto.UserDTO;
import com.onemount.onefast.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserService userService;

   @Autowired
   private PasswordEncoder passwordEncoder;

    @Autowired
    private MyAuthenticationEntryPoint authenticationEntryPoint;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Override
  protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                // dont authenticate this particular request
                .authorizeRequests().antMatchers("/api/rest/car", "/login").permitAll().
                // all other requests need to be authenticated
                        anyRequest().authenticated().and().
                // make sure we use stateless session; session won't be used to
                // store user's state.
                        exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // Add a filter to validate the tokens with every request
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//        http = http.cors().and().csrf().disable();
//
//        // Set session management to stateless
//        http = http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and();
//
//        // Set unauthorized requests exception handler
//        http = http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and();
//
//        http.authorizeRequests()
//                // Our public endpoints
//                .antMatchers(HttpMethod.GET, "/api/rest/car").permitAll()
//                // Our private endpoints
//                .anyRequest().authenticated();
//        // Add JWT token filter
//        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//    http.httpBasic();
//    //http.formLogin();
//    http.authorizeRequests()
//    .antMatchers("/api/rest/showroom").hasAnyRole("USER")
//    .antMatchers("/api/rest/car").hasAnyRole("ADMIN")
//    .antMatchers("/**").permitAll();
  }

  @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder);
        return auth;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        if (!userService.emailExisted("admin@onefast.com")) {
            UserDTO regUser = new UserDTO("admin", "", "admin@onefast.com", "admin", "ADMIN");
            userService.createUser(regUser);
        }

        if (!userService.emailExisted("usertest@onefast.com")) {
            UserDTO regUser = new UserDTO("usertest", "", "usertest@onefast.com", "admin", "USER");
            userService.createUser(regUser);
        }
    }
    
}
