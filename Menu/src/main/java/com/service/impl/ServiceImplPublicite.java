/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Publicite;
import com.service.PubliciteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplPublicite implements PubliciteService{
    
    
    @Autowired
    private com.repository.DAOpublicite PubliciteDao;
    
    
    public void setPubliciteDao(com.repository.DAOpublicite PubliciteDao) {
        this.PubliciteDao = PubliciteDao;
    }
    
    @Transactional
    public void insertPublicite(Publicite u) {
        PubliciteDao.save(u);
    }

    @Transactional
    public void updatePublicite(Publicite u) {
        PubliciteDao.save(u);
    }

    @Transactional
    public void deletePublicite(int id) {
        PubliciteDao.delete(id);
    }

    @Transactional
    public Publicite selectPublicite(int id) {
          return PubliciteDao.findOne(id);
    }

    @Transactional
    public List allPublicite() {
        return PubliciteDao.findAll();
    }
}