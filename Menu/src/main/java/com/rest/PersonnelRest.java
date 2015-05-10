package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Personnel;
import com.service.PersonnelService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/personnel")
public class PersonnelRest {

	@Autowired
	private PersonnelService PersonnelService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Personnel> findAll() {
		return PersonnelService.allPersonnel();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Personnel findPersonnel(@PathVariable("id") int id) {
		return PersonnelService.selectPersonnel(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createPersonnel(Personnel Personnel) {
		 PersonnelService.insertPersonnel(Personnel);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Personnel Personnel) {
		PersonnelService.updatePersonnel(Personnel);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		PersonnelService.deletePersonnel(id);
	}
}
