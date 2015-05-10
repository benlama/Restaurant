/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Client;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface ClientService {
    public void insertClient(Client u);
    public void updateClient(Client u);
    public void deleteClient(int id);
    public Client selectClient(int id);
    public List allClient();
}
