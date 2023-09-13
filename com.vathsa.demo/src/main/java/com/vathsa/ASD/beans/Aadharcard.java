package com.vathsa.ASD.beans;

import org.springframework.stereotype.Component;

@Component
public class Aadharcard
{
	   private String name;
	   private int age;
	   private String gender;
	   private int aadharNo;
	   public Aadharcard() {}
	public Aadharcard(String name, int age, String gender, int aadharNo)
	{
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	   
}
