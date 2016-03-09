package com.gies.chenzhan.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="sys_role")
public class SysRole {
	
@Id
@GeneratedValue
private int role_id;
@Column(name="name",nullable=false)
private String name;

@OneToMany(mappedBy="sysRole")
private Set<SysUser> SysUsers;

public Set<SysUser> getSysUsers() {
	return SysUsers;
}

public void setSysUsers(Set<SysUser> sysUsers) {
	SysUsers = sysUsers;
}

public String getName() {
	return name;
}

public int getRole_id() {
	return role_id;
}
public void setRole_id(int role_id) {
	this.role_id = role_id;
}


public void setName(String name) {
	this.name = name;
}

}
