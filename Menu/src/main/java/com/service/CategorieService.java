/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.Categorie;

/**
 *
 * @author DNS
 */
public interface CategorieService {
    public void insertCategorie(Categorie u);
    public void updateCategorie(Categorie u);
    public void deleteCategorie(int id);
    public Categorie selectCategorie(int id);
    public List allCategorie();
}