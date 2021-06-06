package com.onemount.onefast.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", length = 100)
    private String fullname;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "modified_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @Column(name = "is_active")
    private boolean isActive;

    public User() {
        
    }

    public User(String fullname, String phone, String email, String password, Date createdAt, Date modifiedAt,
            boolean isActive) {
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.isActive = isActive;
    }

    public User(Long id, String fullname, String phone, String email, String password, Date createdAt, Date modifiedAt,
            boolean isActive) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    

    
}
