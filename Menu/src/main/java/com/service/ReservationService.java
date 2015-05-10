/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.Reservation;

/**
 *
 * @author DNS
 */
public interface ReservationService {
    public void insertReservation(Reservation u);
    public void updateReservation(Reservation u);
    public void deleteReservation(int id);
    public Reservation selectReservation(int id);
    public List allReservation();
}