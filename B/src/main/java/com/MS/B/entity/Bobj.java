package com.MS.B.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bobj {
 
	@Id
	private String name;
	private String mobileNo;
	private int age;
	public Bobj() {
	}
	public Bobj(String name, String mobileNo, int age) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Bobj [Name=" + this.name + ", MobileNo=" + this.mobileNo + ", age=" + age + "]";
	}
	
}
