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

import com.gies.chenzhan.models.SysRole;
import com.gies.chenzhan.models.SysUser;
import com.gies.chenzhan.services.SysRoleService;
import com.gies.chenzhan.services.SysUserService;

@Controller
@RequestMapping(value="/user")
public class SysUserController {

	@Autowired
	SysUserService userService;
	
	@Autowired
	SysRoleService roleService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(SysUserController.class);
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add() {
		
		SysUser user=new SysUser();
		user.setFirst_name("test");
		user.setIs_active("t");
		user.setLast_name("gies_user");
		user.setModified(new Date());
		user.setCreated(new Date());
		user.setUser_name("test.gies_user");
		SysRole role=roleService.findById(2);
		
		user.setSysRole(role);
		userService.saveUser(user);
		//logger.info("ADD for User is called!");
	}

	
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	  public String getAll() {
	
	  List<SysUser> results=userService.findAllSysUsers();
	  logger.info("GET!!");
	  
	  for (SysUser temp : results) {
			System.out.println(temp.getFirst_name()+"."+temp.getLast_name());
		}
	  return "something";
	  }
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	  public String deletePerson(@PathVariable("id")int id) {
	
	    userService.deleteUserById(id);;
	    logger.info("DELETE!!");
	return "something";
	  }
}
