/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.Restaurant;

/**
 *
 * @author DNS
 */
public interface RestaurantService {
    public void insertRestaurant(Restaurant u);
    public void updateRestaurant(Restaurant u);
    public void deleteRestaurant(int id);
    public Restaurant selectRestaurant(int id);
    public List allRestaurant();
}