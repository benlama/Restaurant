/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;


import com.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author DNS
 */
@RepositoryRestResource(path = "utilisateur")
public interface DAOutilisateur extends JpaRepository<Utilisateur, Integer>{    
    public Utilisateur findFirstByUsernameIgnoreCase(String username);
}
