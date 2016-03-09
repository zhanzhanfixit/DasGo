package com.gies.chenzhan.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person implements Serializable {
 
	  private static final long serialVersionUID = 1L; 
@Id
  @GeneratedValue
  private int id;
  @Column(name="name",nullable=false)
  private String name;
   
  /* getters & setters */
  
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
}
