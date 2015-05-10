package com.rest;

import java.util.List;

import com.model.Zone;
import com.service.ZoneService;
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
@RequestMapping("/rest/zone")
public class ZoneRest 
{
	@Autowired
	private ZoneService ZoneService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Zone> findAll() {
		return ZoneService.allZone();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Zone findZone(@PathVariable("id") int id) {
		return ZoneService.selectZone(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createZone(Zone Zone) {
		 ZoneService.insertZone(Zone);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Zone Zone) {
		ZoneService.updateZone(Zone);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		ZoneService.deleteZone(id);
	}
}
