package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Ingredient;
import com.service.IngredientService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/ingredient")
public class IngredientRest {

	@Autowired
	private IngredientService IngredientService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Ingredient> findAll() {
		return IngredientService.allIngredient();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Ingredient findIngredient(@PathVariable("id") int id) {
		return IngredientService.selectIngredient(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createIngredient(Ingredient Ingredient) {
		 IngredientService.insertIngredient(Ingredient);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Ingredient Ingredient) {
		IngredientService.updateIngredient(Ingredient);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		IngredientService.deleteIngredient(id);
	}
}
