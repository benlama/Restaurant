/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.PlatIngredient;
import com.service.PlatIngredientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplPlatIngredient implements PlatIngredientService{
    
    
    @Autowired
    private com.repository.DAOplatIngredient PlatIngredientDao;
    
    
    public void setPlatIngredientDao(com.repository.DAOplatIngredient PlatIngredientDao) {
        this.PlatIngredientDao = PlatIngredientDao;
    }
    
    @Transactional
    public void insertPlatIngredient(PlatIngredient u) {
        PlatIngredientDao.save(u);
    }

    @Transactional
    public void updatePlatIngredient(PlatIngredient u) {
        PlatIngredientDao.save(u);
    }

    @Transactional
    public void deletePlatIngredient(int id) {
        PlatIngredientDao.delete(id);
    }

    @Transactional
    public PlatIngredient selectPlatIngredient(int id) {
          return PlatIngredientDao.findOne(id);
    }

    @Transactional
    public List allPlatIngredient() {
        return PlatIngredientDao.findAll();
    }
}