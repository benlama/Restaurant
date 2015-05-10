/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Fournisseur;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface FournisseurService {
    public void insertFournisseur(Fournisseur u);
    public void updateFournisseur(Fournisseur u);
    public void deleteFournisseur(int id);
    public Fournisseur selectFournisseur(int id);
    public List allFournisseur();
}
