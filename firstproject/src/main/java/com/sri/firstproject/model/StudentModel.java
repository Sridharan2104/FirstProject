package com.sri.firstproject.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
//@Table(name="school")
public class StudentModel {
	@Id
	private int num;
	private String name;
	private String dept;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
 
	
}
