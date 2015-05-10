/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.FeedBack;
import com.service.FeedBackService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */
@Service
public class ServiceImplFeedBack implements FeedBackService{
    
    @Autowired
    private com.repository.DAOfeedBack FeedBackDao;
    
    
    public void setFeedBackDao(com.repository.DAOfeedBack FeedBackDao) {
        this.FeedBackDao = FeedBackDao;
    }
    
    @Transactional
    public void insertFeedBack(FeedBack u) {
        FeedBackDao.save(u);
    }

    @Transactional
    public void updateFeedBack(FeedBack u) {
        FeedBackDao.save(u);
    }

    @Transactional
    public void deleteFeedBack(int id) {
        FeedBackDao.delete(id);
    }

    @Transactional
    public FeedBack selectFeedBack(int id) {
          return FeedBackDao.findOne(id);
    }

    @Transactional
    public List allFeedBack() {
        return FeedBackDao.findAll();
    }
}
