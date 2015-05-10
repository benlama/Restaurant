/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;


import com.model.Role;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface RoleService {
    public void insertRole(Role u);
    public void updateRole(Role u);
    public void deleteRole(int id);
    public Role selectRole(int id);
    public List allRole();
}
