/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Fournisseur;
import com.service.FournisseurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplFournisseur implements FournisseurService{
    
    @Autowired
    private com.repository.DAOfournisseur FournisseurDao;
    
    
    public void setFournisseurDao(com.repository.DAOfournisseur FournisseurDao) {
        this.FournisseurDao = FournisseurDao;
    }
    
    @Transactional
    public void insertFournisseur(Fournisseur u) {
        FournisseurDao.save(u);
    }

    @Transactional
    public void updateFournisseur(Fournisseur u) {
        FournisseurDao.save(u);
    }

    @Transactional
    public void deleteFournisseur(int id) {
        FournisseurDao.delete(id);
    }

    @Transactional
    public Fournisseur selectFournisseur(int id) {
          return FournisseurDao.findOne(id);
    }

    @Transactional
    public List allFournisseur() {
        return FournisseurDao.findAll();
    }
    
}
