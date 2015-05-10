/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Commande;
import com.service.CommandeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplCommande implements CommandeService{
       
    @Autowired
    private com.repository.DAOcommande CommandeDao;
    
    
    public void setCommandeDao(com.repository.DAOcommande CommandeDao) {
        this.CommandeDao = CommandeDao;
    }
    
    @Transactional
    public void insertCommande(Commande u) {
        CommandeDao.save(u);
    }

    @Transactional
    public void updateCommande(Commande u) {
        CommandeDao.save(u);
    }

    @Transactional
    public void deleteCommande(int id) {
        CommandeDao.delete(id);
    }

    @Transactional
    public Commande selectCommande(int id) {
          return CommandeDao.findOne(id);
    }

    @Transactional
    public List allCommande() {
        return CommandeDao.findAll();
    }
   
    
}
