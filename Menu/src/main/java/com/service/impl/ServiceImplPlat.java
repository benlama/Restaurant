/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Plat;
import com.service.PlatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplPlat implements PlatService{
    
    @Autowired
    private com.repository.DAOplat PlatDao;
    
    
    public void setUtilisateurDao(com.repository.DAOplat PlatDao) {
        this.PlatDao = PlatDao;
    }
    
    @Transactional
    public void insertPlat(Plat u) {
        PlatDao.save(u);
    }

    @Transactional
    public void updatePlat(Plat u) {
        PlatDao.save(u);
    }

    @Transactional
    public void deletePlat(int id) {
        PlatDao.delete(id);
    }

    @Transactional
    public Plat selectPlat(int id) {
          return PlatDao.findOne(id);
    }

    @Transactional
    public List allPlat() {
        return PlatDao.findAll();
    }
    
}
