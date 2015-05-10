/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.Zone;

/**
 *
 * @author DNS
 */
public interface ZoneService {
    public void insertZone(Zone u);
    public void updateZone(Zone u);
    public void deleteZone(int id);
    public Zone selectZone(int id);
    public List allZone();
}