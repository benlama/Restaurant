package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Role;
import com.service.RoleService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/role")
public class RoleRest {

	@Autowired
	private RoleService RoleService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Role> findAll() {
		return RoleService.allRole();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public Role findRole(@PathVariable("id") int id) {
		return RoleService.selectRole(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createRole(Role Role) {
		 RoleService.insertRole(Role);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, Role Role) {
		RoleService.updateRole(Role);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		RoleService.deleteRole(id);
	}
}
