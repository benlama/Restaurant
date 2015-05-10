/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Cordonner;
import com.service.CordonnerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplCordonner implements CordonnerService{
    
    @Autowired
    private com.repository.DAOcordonner CordonnerDao;
    
    
    public void setCordonnerDao(com.repository.DAOcordonner CordonnerDao) {
        this.CordonnerDao = CordonnerDao;
    }
    
    @Transactional
    public void insertCordonner(Cordonner u) {
        CordonnerDao.save(u);
    }

    @Transactional
    public void updateCordonner(Cordonner u) {
        CordonnerDao.save(u);
    }

    @Transactional
    public void deleteCordonner(int id) {
        CordonnerDao.delete(id);
    }

    @Transactional
    public Cordonner selectCordonner(int id) {
          return CordonnerDao.findOne(id);
    }

    @Transactional
    public List allCordonner() {
        return CordonnerDao.findAll();
    }
}
