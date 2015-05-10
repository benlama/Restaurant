/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.model.ProduitEnStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author DNS
 */
@RepositoryRestResource(path = "produitenstock")
public interface DAOproduitEnStock extends JpaRepository<ProduitEnStock, Integer>{
    
}
