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

@Repository
public class SysRoleDao {

	@PersistenceContext
	 private EntityManager em;
	@Transactional
	 public void saveRole(SysRole role) {
		
		
		
		SysRole role2=new SysRole();
		 role2.setName("test_role");
			
		 em.persist(role2);
	}
	
	public List<SysRole> findAllSysRoles(){
		List<SysRole> result = em.createQuery("SELECT p FROM SysRole p", SysRole.class).getResultList();
		return result;
	}
	
	public void deleteRoleById(int id){
	
		SysRole roleFromDB= em.find(SysRole.class, id);
		
		em.remove(roleFromDB);
		
	}
	
	public SysRole findById(int id){
		
		SysRole role=em.find(SysRole.class, id);
		return role;
	}
}
