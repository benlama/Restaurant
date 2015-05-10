package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Plat;
import com.service.PlatService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/plat")
public class PlatRest {

	@Autowired
	private PlatService PlatService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Plat> findAll() {
		return PlatService.allPlat();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Plat findPlat(@PathVariable("id") int id) {
		return PlatService.selectPlat(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createPlat(Plat Plat) {
		 PlatService.insertPlat(Plat);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Plat Plat) {
		PlatService.updatePlat(Plat);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		PlatService.deletePlat(id);
	}
}
