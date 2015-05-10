package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Reservation;
import com.service.ReservationService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/Reservation")
public class ReservationRest {

	@Autowired
	private ReservationService ReservationService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Reservation> findAll() {
		return ReservationService.allReservation();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Reservation findReservation(@PathVariable("id") int id) {
		return ReservationService.selectReservation(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createReservation(Reservation Reservation) {
		 ReservationService.insertReservation(Reservation);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Reservation Reservation) {
		ReservationService.updateReservation(Reservation);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		ReservationService.deleteReservation(id);
	}
}
