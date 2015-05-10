/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;


import com.model.LigneCmd;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface LigneCmdService {
    public void insertLigneCmd(LigneCmd u);
    public void updateLigneCmd(LigneCmd u);
    public void deleteLigneCmd(int id);
    public LigneCmd selectLigneCmd(int id);
    public List allLigneCmd();
}
