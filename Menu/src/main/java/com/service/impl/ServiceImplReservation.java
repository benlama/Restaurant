/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.model.Reservation;
import com.service.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DNS
 */

@Service
public class ServiceImplReservation implements ReservationService{
    
    
    @Autowired
    private com.repository.DAOreservation ReservationDao;
    
    
    public void setReservationDao(com.repository.DAOreservation ReservationDao) {
        this.ReservationDao = ReservationDao;
    }
    
    @Transactional
    public void insertReservation(Reservation u) {
        ReservationDao.save(u);
    }

    @Transactional
    public void updateReservation(Reservation u) {
        ReservationDao.save(u);
    }

    @Transactional
    public void deleteReservation(int id) {
        ReservationDao.delete(id);
    }

    @Transactional
    public Reservation selectReservation(int id) {
          return ReservationDao.findOne(id);
    }

    @Transactional
    public List allReservation() {
        return ReservationDao.findAll();
    }
}