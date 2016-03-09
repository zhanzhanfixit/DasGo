package com.gies.chenzhan.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gies.chenzhan.models.SysRole;
import com.gies.chenzhan.models.SysUser;

@Repository
public class SysUserDao {

	@PersistenceContext
	 private EntityManager em;
	@Transactional
	 public void saveUser(SysUser user) {
		 em.persist(user);
	}
	
	public List<SysUser> findAllSysUsers(){
		List<SysUser> result = em.createQuery("SELECT p FROM SysUser p", SysUser.class).getResultList();
		return result;
	}
	
	public void deleteUserById(int id){
	
		SysUser userFromDB= em.find(SysUser.class, id);
		
		em.remove(userFromDB);
		
	}
	
	public SysUser findById(int id){
		
		SysUser user=em.find(SysUser.class, id);
		return user;
	}
	

}
