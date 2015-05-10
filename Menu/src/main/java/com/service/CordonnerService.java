/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Cordonner;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface CordonnerService {
    public void insertCordonner(Cordonner u);
    public void updateCordonner(Cordonner u);
    public void deleteCordonner(int id);
    public Cordonner selectCordonner(int id);
    public List allCordonner();
}
