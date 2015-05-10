/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.PlatIngredient;

/**
 *
 * @author DNS
 */
public interface PlatIngredientService {
    public void insertPlatIngredient(PlatIngredient u);
    public void updatePlatIngredient(PlatIngredient u);
    public void deletePlatIngredient(int id);
    public PlatIngredient selectPlatIngredient(int id);
    public List allPlatIngredient();
}