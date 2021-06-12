package com.onemount.onefast.service;

import java.util.List;

import com.onemount.onefast.model.Role;

public interface RoleService {
    List<Role> getAllRole();
    Role getRoleByName(String roleName);
    boolean roleNameExisted(String roleName);
}
