/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.LigneCmd;
import com.service.LigneCmdService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplLigneCmd implements LigneCmdService{
    
    @Autowired
    private com.repository.DAOligneCmd LigneCmdDao;
    
    
    public void setLigneCmdDao(com.repository.DAOligneCmd LigneCmdDao) {
        this.LigneCmdDao = LigneCmdDao;
    }
    
    @Transactional
    public void insertLigneCmd(LigneCmd u) {
        LigneCmdDao.save(u);
    }

    @Transactional
    public void updateLigneCmd(LigneCmd u) {
        LigneCmdDao.save(u);
    }

    @Transactional
    public void deleteLigneCmd(int id) {
        LigneCmdDao.delete(id);
    }

    @Transactional
    public LigneCmd selectLigneCmd(int id) {
          return LigneCmdDao.findOne(id);
    }

    @Transactional
    public List allLigneCmd() {
        return LigneCmdDao.findAll();
    }
}
