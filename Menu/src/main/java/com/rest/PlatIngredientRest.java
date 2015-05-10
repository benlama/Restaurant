package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.PlatIngredient;
import com.service.PlatIngredientService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/platingredient")
public class PlatIngredientRest {

	@Autowired
	private PlatIngredientService PlatIngredientService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<PlatIngredient> findAll() {
		return PlatIngredientService.allPlatIngredient();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public PlatIngredient findPlatIngredient(@PathVariable("id") int id) {
		return PlatIngredientService.selectPlatIngredient(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createPlatIngredient(PlatIngredient PlatIngredient) {
		 PlatIngredientService.insertPlatIngredient(PlatIngredient);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, PlatIngredient PlatIngredient) {
		PlatIngredientService.updatePlatIngredient(PlatIngredient);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		PlatIngredientService.deletePlatIngredient(id);
	}
}
