package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Fournisseur;
import com.service.FournisseurService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/fournisseur")
public class FournisseurRest {

	@Autowired
	private FournisseurService FournisseurService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Fournisseur> findAll() {
		return FournisseurService.allFournisseur();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Fournisseur findFournisseur(@PathVariable("id") int id) {
		return FournisseurService.selectFournisseur(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createFournisseur(Fournisseur Fournisseur) {
		 FournisseurService.insertFournisseur(Fournisseur);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Fournisseur Fournisseur) {
		FournisseurService.updateFournisseur(Fournisseur);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		FournisseurService.deleteFournisseur(id);
	}
}
