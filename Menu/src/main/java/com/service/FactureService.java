/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Facture;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface FactureService {
    public void insertFacture(Facture u);
    public void updateFacture(Facture u);
    public void deleteFacture(int id);
    public Facture selectFacture(int id);
    public List allFacture();
}
