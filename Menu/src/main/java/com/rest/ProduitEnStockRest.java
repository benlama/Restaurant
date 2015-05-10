package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.ProduitEnStock;
import com.service.ProduitEnStockService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/produitenstock")
public class ProduitEnStockRest {

	@Autowired
	private ProduitEnStockService ProduitEnStockService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<ProduitEnStock> findAll() {
		return ProduitEnStockService.allProduitEnStock();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public ProduitEnStock findProduitEnStock(@PathVariable("id") int id) {
		return ProduitEnStockService.selectProduitEnStock(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createProduitEnStock(ProduitEnStock ProduitEnStock) {
		 ProduitEnStockService.insertProduitEnStock(ProduitEnStock);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, ProduitEnStock ProduitEnStock) {
		ProduitEnStockService.updateProduitEnStock(ProduitEnStock);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		ProduitEnStockService.deleteProduitEnStock(id);
	}
}
