/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Role;
import com.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplRole implements RoleService{
    
    @Autowired
    private com.repository.DAOrole RoleDao;
    
    
    public void setRoleDao(com.repository.DAOrole RoleDao) {
        this.RoleDao = RoleDao;
    }
    
    @Transactional
    public void insertRole(Role u) {
        RoleDao.save(u);
    }

    @Transactional
    public void updateRole(Role u) {
        RoleDao.save(u);
    }

    @Transactional
    public void deleteRole(int id) {
        RoleDao.delete(id);
    }

    @Transactional
    public Role selectRole(int id) {
          return RoleDao.findOne(id);
    }

    @Transactional
    public List allRole() {
        return RoleDao.findAll();
    }
}
