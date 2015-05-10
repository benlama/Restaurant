package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Facture;
import com.service.FactureService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/facture")
public class FactureRest {

	@Autowired
	private FactureService FactureService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Facture> findAll() {
		return FactureService.allFacture();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Facture findFacture(@PathVariable("id") int id) {
		return FactureService.selectFacture(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createFacture(Facture Facture) {
		 FactureService.insertFacture(Facture);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Facture Facture) {
		FactureService.updateFacture(Facture);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		FactureService.deleteFacture(id);
	}
}
