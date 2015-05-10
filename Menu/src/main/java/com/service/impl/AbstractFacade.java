/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Categorie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

/*

public abstract class AbstractFacade<T> extends Seraializable {
    private Class<T> serviceClass;

    public AbstractFacade(Class<T> serviceClass) {
        this.serviceClass = serviceClass;
    }

    protected abstract JpaRepository<T,Integer> getserviceManager();
   
    
    @Transactional
    public void insert(T service) {
        getserviceManager().save(service);
    }

    @Transactional
    public void update(T service) {
        getserviceManager().save(service);
    }

    @Transactional
    public void delete(int id) {
        getserviceManager().delete(getserviceManager().findById(id));
    }

    @Transactional
    public T select(Object id) {
          return getserviceManager().findOne(id);
    }

    @Transactional
    public List<T> all() {
        return getserviceManager().findAll();
    }
   
}
*/