package com.onemount.onefast.service;

import java.util.List;

import com.onemount.onefast.model.Role;
import com.onemount.onefast.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRole() {
        
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    @Override
    public boolean roleNameExisted(String roleName) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
