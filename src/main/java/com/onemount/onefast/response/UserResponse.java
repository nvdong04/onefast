package com.onemount.onefast.response;

import java.io.Serializable;
import java.util.List;

public class UserResponse implements Serializable {
    private String fullname;
    private String phone;
    private String email;
    private List<String> role;

    public UserResponse() {

    }

    public UserResponse(String fullname, String phone, String email, List<String> role) {
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
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

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }
}
