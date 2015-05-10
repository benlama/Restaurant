package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Commande;
import com.service.CommandeService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/commande")
public class CommandeRest {

	@Autowired
	private CommandeService CommandeService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Commande> findAll() {
		return CommandeService.allCommande();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Commande findCommande(@PathVariable("id") int id) {
		return CommandeService.selectCommande(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createCommande(Commande Commande) {
		 CommandeService.insertCommande(Commande);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Commande Commande) {
		CommandeService.updateCommande(Commande);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		CommandeService.deleteCommande(id);
	}
}
