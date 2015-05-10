/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.model.PlatIngredient;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author DNS
 */
@RepositoryRestResource(path = "platingredient")
public interface DAOplatIngredient extends JpaRepository<PlatIngredient, Integer>{
    
}
