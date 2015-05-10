package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Utilisateur;
import com.service.UtilisateurService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/utilisateur")
public class UtilisateurRest {

	@Autowired
	private UtilisateurService UtilisateurService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return UtilisateurService.allUtilisateur();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Utilisateur findUtilisateur(@PathVariable("id") int id) {
		return UtilisateurService.selectUtilisateur(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createUtilisateur(Utilisateur Utilisateur) {
		 UtilisateurService.insertUtilisateur(Utilisateur);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Utilisateur Utilisateur) {
		UtilisateurService.updateUtilisateur(Utilisateur);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		UtilisateurService.deleteUtilisateur(id);
	}
}