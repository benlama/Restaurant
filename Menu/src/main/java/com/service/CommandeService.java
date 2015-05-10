/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Commande;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface CommandeService {
    public void insertCommande(Commande u);
    public void updateCommande(Commande u);
    public void deleteCommande(int id);
    public Commande selectCommande(int id);
    public List allCommande();
}
