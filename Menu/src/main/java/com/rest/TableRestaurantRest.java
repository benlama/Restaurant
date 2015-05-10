package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.TableRestaurant;
import com.service.TableRestaurantService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/table")
public class TableRestaurantRest {

	@Autowired
	private TableRestaurantService TableRestaurantService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<TableRestaurant> findAll() {
		return TableRestaurantService.allTableRestaurant();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public TableRestaurant findTableRestaurant(@PathVariable("id") int id) {
		return TableRestaurantService.selectTableRestaurant(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createTableRestaurant(TableRestaurant TableRestaurant) {
		 TableRestaurantService.insertTableRestaurant(TableRestaurant);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, TableRestaurant TableRestaurant) {
		TableRestaurantService.updateTableRestaurant(TableRestaurant);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		TableRestaurantService.deleteTableRestaurant(id);
	}
}
