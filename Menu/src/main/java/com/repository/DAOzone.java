/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 *
 * @author DNS
 */
@RepositoryRestResource(path = "zone")
public interface DAOzone extends JpaRepository<Zone, Integer> {
    
}
