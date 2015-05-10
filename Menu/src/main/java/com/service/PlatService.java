package com.service;


import com.model.Plat;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DNS
 */
public interface PlatService {
    public void insertPlat(Plat u);
    public void updatePlat(Plat u);
    public void deletePlat(int id);
    public Plat selectPlat(int id);
    public List allPlat();
}
