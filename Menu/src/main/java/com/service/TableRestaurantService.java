/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.TableRestaurant;

/**
 *
 * @author DNS
 */
public interface TableRestaurantService {
    public void insertTableRestaurant(TableRestaurant u);
    public void updateTableRestaurant(TableRestaurant u);
    public void deleteTableRestaurant(int id);
    public TableRestaurant selectTableRestaurant(int id);
    public List allTableRestaurant();
}