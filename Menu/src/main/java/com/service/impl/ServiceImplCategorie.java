/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Categorie;
import com.service.CategorieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplCategorie implements CategorieService{
    
    
    @Autowired
    private com.repository.DAOcategorie CategorieDao;
    
    
    public void setCategorieDao(com.repository.DAOcategorie CategorieDao) {
        this.CategorieDao = CategorieDao;
    }
    
    @Transactional
    public void insertCategorie(Categorie u) {
        CategorieDao.save(u);
    }

    @Transactional
    public void updateCategorie(Categorie u) {
        CategorieDao.save(u);
    }

    @Transactional
    public void deleteCategorie(int id) {
        CategorieDao.delete(id);
    }

    @Transactional
    public Categorie selectCategorie(int id) {
          return CategorieDao.findOne(id);
    }

    @Transactional
    public List allCategorie() {
        return CategorieDao.findAll();
    }
}