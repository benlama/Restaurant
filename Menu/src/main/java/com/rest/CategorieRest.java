package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Categorie;
import com.service.CategorieService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/Categorie")
public class CategorieRest {

	@Autowired
	private CategorieService CategorieService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Categorie> findAll() {
		return CategorieService.allCategorie();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Categorie findCategorie(@PathVariable("id") int id) {
		return CategorieService.selectCategorie(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createCategorie(Categorie Categorie) {
		 CategorieService.insertCategorie(Categorie);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Categorie Categorie) {
		CategorieService.updateCategorie(Categorie);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		CategorieService.deleteCategorie(id);
	}
}
