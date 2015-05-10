/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.ProduitEnStock;

/**
 *
 * @author DNS
 */
public interface ProduitEnStockService {
    public void insertProduitEnStock(ProduitEnStock u);
    public void updateProduitEnStock(ProduitEnStock u);
    public void deleteProduitEnStock(int id);
    public ProduitEnStock selectProduitEnStock(int id);
    public List allProduitEnStock();
}