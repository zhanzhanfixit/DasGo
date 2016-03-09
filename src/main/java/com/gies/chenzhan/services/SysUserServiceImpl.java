package com.gies.chenzhan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gies.chenzhan.dao.SysRoleDao;
import com.gies.chenzhan.dao.SysUserDao;
import com.gies.chenzhan.models.SysRole;
import com.gies.chenzhan.models.SysUser;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	SysUserDao sysUserDao;
	
	
	@Override
	public SysUser findById(int id) {
		
		SysUser user=sysUserDao.findById(id);
		
		return user;
	}

	@Override
	public void saveUser(SysUser user) {
		
		 sysUserDao.saveUser(user);
	
		
	}

	@Override
	public List<SysUser> findAllSysUsers() {
		
		List<SysUser> result=sysUserDao.findAllSysUsers();
		
		return result;
	}

	@Override
	public void deleteUserById(int id) {
	
		sysUserDao.deleteUserById(id);
		
	}

	

}
