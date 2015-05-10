/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Ingredient;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface IngredientService {
    public void insertIngredient(Ingredient u);
    public void updateIngredient(Ingredient u);
    public void deleteIngredient(int id);
    public Ingredient selectIngredient(int id);
    public List allIngredient();
}
