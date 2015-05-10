/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;


import com.model.Utilisateur;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface UtilisateurService {
    public void insertUtilisateur(Utilisateur u);
    public void updateUtilisateur(Utilisateur u);
    public void deleteUtilisateur(int id);
    public Utilisateur selectUtilisateur(int id);
    public List allUtilisateur();
    public Utilisateur getUtilisateurByUsername(String username);
}
