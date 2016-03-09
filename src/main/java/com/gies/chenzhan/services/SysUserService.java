package com.gies.chenzhan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gies.chenzhan.models.SysUser;


public interface SysUserService {

	 SysUser findById(int id);
     
	 void saveUser(SysUser employee);
	    
	 List<SysUser> findAllSysUsers(); 
	     
	 void deleteUserById(int id);
	
}
