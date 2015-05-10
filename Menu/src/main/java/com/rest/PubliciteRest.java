package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Publicite;
import com.service.PubliciteService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/publicite")
public class PubliciteRest {

	@Autowired
	private PubliciteService PubliciteService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Publicite> findAll() {
		return PubliciteService.allPublicite();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Publicite findPublicite(@PathVariable("id") int id) {
		return PubliciteService.selectPublicite(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST ,consumes="application/json" ,produces = "application/json")
	public void createPublicite(@RequestBody Publicite Publicite) {
		    PubliciteService.insertPublicite(Publicite);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Publicite Publicite) {
		PubliciteService.updatePublicite(Publicite);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		PubliciteService.deletePublicite(id);
	}
}