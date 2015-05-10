/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Ingredient;
import com.service.IngredientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplIngredient implements IngredientService{
    
    @Autowired
    private com.repository.DAOingredient IngredientDao;
    
    
    public void setIngredientDao(com.repository.DAOingredient IngredientDao) {
        this.IngredientDao = IngredientDao;
    }
    
    @Transactional
    public void insertIngredient(Ingredient u) {
        IngredientDao.save(u);
    }

    @Transactional
    public void updateIngredient(Ingredient u) {
        IngredientDao.save(u);
    }

    @Transactional
    public void deleteIngredient(int id) {
        IngredientDao.delete(id);
    }

    @Transactional
    public Ingredient selectIngredient(int id) {
          return IngredientDao.findOne(id);
    }

    @Transactional
    public List allIngredient() {
        return IngredientDao.findAll();
    }
    
}
