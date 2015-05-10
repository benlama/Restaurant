/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Zone;
import com.service.ZoneService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplZone implements ZoneService{
    
    
    @Autowired
    private com.repository.DAOzone ZoneDao;
    
    
    public void setZoneDao(com.repository.DAOzone ZoneDao) {
        this.ZoneDao = ZoneDao;
    }
    
    @Transactional
    public void insertZone(Zone u) {
        ZoneDao.save(u);
    }

    @Transactional
    public void updateZone(Zone u) {
        ZoneDao.save(u);
    }

    @Transactional
    public void deleteZone(int id) {
        ZoneDao.delete(id);
    }

    @Transactional
    public Zone selectZone(int id) {
          return ZoneDao.findOne(id);
    }

    @Transactional
    public List allZone() {
        return ZoneDao.findAll();
    }
}