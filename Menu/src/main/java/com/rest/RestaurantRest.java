package com.rest;

import java.util.List;

import com.model.Restaurant;
import com.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */

@RestController
@RequestMapping("/rest/restaurant")
public class RestaurantRest 
{
	@Autowired
	private RestaurantService RestaurantService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Restaurant> findAll() {
		return RestaurantService.allRestaurant();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Restaurant findRestaurant(@PathVariable("id") int id) {
		return RestaurantService.selectRestaurant(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createRestaurant(Restaurant restaurant) {
		 RestaurantService.insertRestaurant(restaurant);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Restaurant restaurant) {
		RestaurantService.updateRestaurant(restaurant);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		RestaurantService.deleteRestaurant(id);
	}
}
