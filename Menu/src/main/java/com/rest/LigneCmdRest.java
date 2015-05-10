package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.LigneCmd;
import com.service.LigneCmdService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/lignecmd")
public class LigneCmdRest {

	@Autowired
	private LigneCmdService LigneCmdService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<LigneCmd> findAll() {
		return LigneCmdService.allLigneCmd();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public LigneCmd findLigneCmd(@PathVariable("id") int id) {
		return LigneCmdService.selectLigneCmd(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createLigneCmd(LigneCmd LigneCmd) {
		 LigneCmdService.insertLigneCmd(LigneCmd);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, LigneCmd LigneCmd) {
		LigneCmdService.updateLigneCmd(LigneCmd);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		LigneCmdService.deleteLigneCmd(id);
	}
}
