package com.gies.chenzhan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gies.chenzhan.models.SysRole;


public interface SysRoleService {

	 SysRole findById(int id);
     
	 void saveRole(SysRole employee);
	    
	 List<SysRole> findAllSysRoles(); 
	     
	 void deleteRoleById(int id);
	
}
