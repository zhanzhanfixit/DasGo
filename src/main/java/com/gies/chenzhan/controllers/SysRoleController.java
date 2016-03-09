package com.gies.chenzhan.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gies.chenzhan.models.Person;
import com.gies.chenzhan.models.SysRole;
import com.gies.chenzhan.services.PersonService;
import com.gies.chenzhan.services.SysRoleService;

@Controller
@RequestMapping(value="/role")
public class SysRoleController {

	@Autowired
	SysRoleService roleService;
	
	@Autowired 
	private PersonService personSvc;
	
	private static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add() {
		
		SysRole role=new SysRole();
		roleService.saveRole(role);
		//logger.info("ADD for role is called!");
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.GET)
	  public String addPerson() {
		Person person=new Person();
		person.setName("woca!");
	    personSvc.add(person);
	    logger.info("SET!!");
	return "something";
	  }
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	  public String getAll() {
	
	  List<SysRole> results=roleService.findAllSysRoles();
	  logger.info("GET!!");
	  return "something";
	  }
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	  public String deletePerson(@PathVariable("id")int id) {
	
	    roleService.deleteRoleById(id);;
	    logger.info("DELETE!!");
	return "something";
	  }
}
