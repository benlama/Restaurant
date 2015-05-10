/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Personnel;
import com.service.PersonnelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplPersonnel implements PersonnelService{
    
    @Autowired
    private com.repository.DAOpersonnel PersonnelDao;
    
    
    public void setPersonnelDao(com.repository.DAOpersonnel PersonnelDao) {
        this.PersonnelDao = PersonnelDao;
    }
    
    @Transactional
    public void insertPersonnel(Personnel u) {
        PersonnelDao.save(u);
    }

    @Transactional
    public void updatePersonnel(Personnel u) {
        PersonnelDao.save(u);
    }

    @Transactional
    public void deletePersonnel(int id) {
        PersonnelDao.delete(id);
    }

    @Transactional
    public Personnel selectPersonnel(int id) {
          return PersonnelDao.findOne(id);
    }

    @Transactional
    public List allPersonnel() {
        return PersonnelDao.findAll();
    }
}
