/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Facture;
import com.service.FactureService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplFacture implements FactureService{
    
    @Autowired
    private com.repository.DAOfacture FactureDao;
    
    
    public void setFactureDao(com.repository.DAOfacture EtapeDao) {
        this.FactureDao = EtapeDao;
    }
    
    @Transactional
    public void insertFacture(Facture u) {
        FactureDao.save(u);
    }

    @Transactional
    public void updateFacture(Facture u) {
        FactureDao.save(u);
    }

    @Transactional
    public void deleteFacture(int id) {
        FactureDao.delete(id);
    }

    @Transactional
    public Facture selectFacture(int id) {
          return FactureDao.findOne(id);
    }

    @Transactional
    public List allFacture() {
        return FactureDao.findAll();
    }
}
