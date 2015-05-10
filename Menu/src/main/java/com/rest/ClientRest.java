package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Client;
import com.service.ClientService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/client")
public class ClientRest {

	@Autowired
	private ClientService ClientService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Client> findAll() {
		return ClientService.allClient();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Client findClient(@PathVariable("id") int id) {
		return ClientService.selectClient(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createClient(Client Client) {
		 ClientService.insertClient(Client);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Client Client) {
		ClientService.updateClient(Client);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		ClientService.deleteClient(id);
	}
}
