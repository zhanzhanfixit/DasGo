package com.gies.chenzhan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gies.chenzhan.dao.SysRoleDao;
import com.gies.chenzhan.models.SysRole;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	SysRoleDao roleDao;
	
	
	@Override
	public SysRole findById(int id) {
	
		SysRole role=roleDao.findById(id);
		return role;
	}

	@Override
	public void saveRole(SysRole role) {
		// TODO need to change the way of input 
		
		roleDao.saveRole(role);
	}


	@Override
	public List<SysRole> findAllSysRoles() {
		
		List<SysRole>results=roleDao.findAllSysRoles();
		
		return results;
	}

	@Override
	public void deleteRoleById(int id) {
		
		roleDao.deleteRoleById(id);
		
	}

}
