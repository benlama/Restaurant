/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Utilisateur;
import com.service.UtilisateurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplUtilisateur implements UtilisateurService{
    
    @Autowired
    private com.repository.DAOutilisateur UtilisateurDao;
    
    public void setUtilisateurDao(com.repository.DAOutilisateur UtilisateurDao) {
        this.UtilisateurDao = UtilisateurDao;
    }
    
    @Transactional
    public void insertUtilisateur(Utilisateur u) {
        UtilisateurDao.save(u);
    }
    
    @Transactional
    public void updateUtilisateur(Utilisateur u) {
        UtilisateurDao.save(u);
    }

    @Transactional
    public void deleteUtilisateur(int id) {
        UtilisateurDao.delete(id);
    }

    @Transactional
    public Utilisateur selectUtilisateur(int id) {
          return UtilisateurDao.findOne(id);
    }

    @Transactional
    public List allUtilisateur() {
        return UtilisateurDao.findAll();
    }
    
    @Transactional
    public Utilisateur getUtilisateurByUsername(String username){
        return UtilisateurDao.findFirstByUsernameIgnoreCase(username);
    }
    
}
