/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Restaurant;
import com.service.RestaurantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplRestaurant implements RestaurantService{
    
    
    @Autowired
    private com.repository.DAOrestaurant RestaurantDao;
    
    
    public void setRestaurantDao(com.repository.DAOrestaurant RestaurantDao) {
        this.RestaurantDao = RestaurantDao;
    }
    
    @Transactional
    public void insertRestaurant(Restaurant u) {
        RestaurantDao.save(u);
    }

    @Transactional
    public void updateRestaurant(Restaurant u) {
        RestaurantDao.save(u);
    }

    @Transactional
    public void deleteRestaurant(int id) {
        RestaurantDao.delete(id);
    }

    @Transactional
    public Restaurant selectRestaurant(int id) {
          return RestaurantDao.findOne(id);
    }

    @Transactional
    public List allRestaurant() {
        return RestaurantDao.findAll();
    }
}