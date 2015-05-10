/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.TableRestaurant;
import com.service.TableRestaurantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DNS
 */

@Service
public class ServiceImplTableRestaurant implements TableRestaurantService{
    
    
    @Autowired
    private com.repository.DAOtableRestaurant TableRestaurantDao;
    
    
    public void setTableRestaurantDao(com.repository.DAOtableRestaurant TableRestaurantDao) {
        this.TableRestaurantDao = TableRestaurantDao;
    }
    
    @Transactional
    public void insertTableRestaurant(TableRestaurant u) {
        TableRestaurantDao.save(u);
    }

    @Transactional
    public void updateTableRestaurant(TableRestaurant u) {
        TableRestaurantDao.save(u);
    }

    @Transactional
    public void deleteTableRestaurant(int id) {
        TableRestaurantDao.delete(id);
    }

    @Transactional
    public TableRestaurant selectTableRestaurant(int id) {
          return TableRestaurantDao.findOne(id);
    }

    @Transactional
    public List allTableRestaurant() {
        return TableRestaurantDao.findAll();
    }
}