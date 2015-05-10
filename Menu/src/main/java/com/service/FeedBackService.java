/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.FeedBack;
import java.util.List;

/**
 *
 * @author DNS
 */
public interface FeedBackService {
    public void insertFeedBack(FeedBack u);
    public void updateFeedBack(FeedBack u);
    public void deleteFeedBack(int id);
    public FeedBack selectFeedBack(int id);
    public List allFeedBack();
}
