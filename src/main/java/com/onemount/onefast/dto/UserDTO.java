package com.onemount.onefast.dto;

public class UserDTO {
    private String fullname;
    private String phone;
    private String email;
    private String password;
    private String role;

    public UserDTO(String email) {
        this.email = email;
    }

    public UserDTO(String fullname, String phone, String email, String password, String role) {
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    
    
    
}
