package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Cordonner;
import com.service.CordonnerService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/cordonner")
public class CordonnerRest {

	@Autowired
	private CordonnerService CordonnerService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Cordonner> findAll() {
		return CordonnerService.allCordonner();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Cordonner findCordonner(@PathVariable("id") int id) {
		return CordonnerService.selectCordonner(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createCordonner(Cordonner Cordonner) {
		 CordonnerService.insertCordonner(Cordonner);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Cordonner Cordonner) {
		CordonnerService.updateCordonner(Cordonner);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		CordonnerService.deleteCordonner(id);
	}
}
