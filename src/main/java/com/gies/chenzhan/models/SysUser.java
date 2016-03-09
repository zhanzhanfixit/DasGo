package com.gies.chenzhan.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="sys_user")
public class SysUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
    private Integer id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="wechat_id")
	private String wechat_id;
	@ManyToOne
	@JoinColumn(name="role_id")
	private SysRole sysRole;
	
	/*
	@Column(name="company_id")
	private Company company;
	*/
	@Column(name="is_active")
	private String is_active;
	/*
	@Column(name="created_by")
	private SysUser created_by;
	
	@Column(name="modified_by")
	private SysUser modified_by;
	*/
	@Column(name="created")
	private Date created;
	
	
	@Column(name="modified")
	private Date modified;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getWechat_id() {
		return wechat_id;
	}


	public void setWechat_id(String wechat_id) {
		this.wechat_id = wechat_id;
	}


	public SysRole getSysRole() {
		return sysRole;
	}


	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}


	public String getIs_active() {
		return is_active;
	}


	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

/*
	public SysUser getCreated_by() {
		return created_by;
	}


	public void setCreated_by(SysUser created_by) {
		this.created_by = created_by;
	}


	public SysUser getModified_by() {
		return modified_by;
	}


	public void setModified_by(SysUser modified_by) {
		this.modified_by = modified_by;
	}
*/

	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Date getModified() {
		return modified;
	}


	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	
	
}
