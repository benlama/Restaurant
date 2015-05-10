/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.ProduitEnStock;
import com.service.ProduitEnStockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplProduitEnStock implements ProduitEnStockService{
    
    
    @Autowired
    private com.repository.DAOproduitEnStock ProduitEnStockDao;
    
    
    public void setProduitEnStockDao(com.repository.DAOproduitEnStock ProduitEnStockDao) {
        this.ProduitEnStockDao = ProduitEnStockDao;
    }
    
    @Transactional
    public void insertProduitEnStock(ProduitEnStock u) {
        ProduitEnStockDao.save(u);
    }

    @Transactional
    public void updateProduitEnStock(ProduitEnStock u) {
        ProduitEnStockDao.save(u);
    }

    @Transactional
    public void deleteProduitEnStock(int id) {
        ProduitEnStockDao.delete(id);
    }

    @Transactional
    public ProduitEnStock selectProduitEnStock(int id) {
          return ProduitEnStockDao.findOne(id);
    }

    @Transactional
    public List allProduitEnStock() {
        return ProduitEnStockDao.findAll();
    }
}