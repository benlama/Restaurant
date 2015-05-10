/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Personnel;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface PersonnelService {
    public void insertPersonnel(Personnel u);
    public void updatePersonnel(Personnel u);
    public void deletePersonnel(int id);
    public Personnel selectPersonnel(int id);
    public List allPersonnel();
}
