package com.MS.B.dto;

import com.MS.B.entity.Bobj;

public class Bdto {

	private String name;
	private String mobileNo;
	private int age;
	public Bdto() {}
	public Bdto(String name, String mobileNo, int age) {
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
		return "Bdto [Name=" + this.name + ", MobileNo=" + this.mobileNo + ", age=" + age + "]";
	}
	public static Bobj prepareEntity(Bdto bdto) {
		Bobj temp=new Bobj(bdto.getName(),bdto.getMobileNo(),bdto.getAge());
		return temp;
	}
	
}
