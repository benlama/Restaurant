/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Client;
import com.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplClient implements ClientService{
    
    @Autowired
    private com.repository.DAOclient ClientDao;
    
    
    public void setClientDao(com.repository.DAOclient ClientDao) {
        this.ClientDao = ClientDao;
    }
    
    @Transactional
    public void insertClient(Client u) {
           ClientDao.save(u);
    }

    @Transactional
    public void updateClient(Client u) {
           ClientDao.save(u);
    }

    @Transactional
    public void deleteClient(int id) {
            ClientDao.delete(id);
    }
    
    @Transactional
    public Client selectClient(int id) {
        return ClientDao.findOne(id);
    }

    @Transactional
    public List allClient() {
           return ClientDao.findAll();
    }
    
}
