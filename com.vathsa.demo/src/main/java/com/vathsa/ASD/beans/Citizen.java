package com.vathsa.ASD.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Citizen 
{
   private int mobileNo;
   private String emailId;
   private Aadharcard aadharcard;
   @Autowired
   public Citizen(Aadharcard aadharcard) {
	super();
	this.aadharcard = aadharcard;
}
public Citizen()  {}
public Citizen(int mobileNo, String emailId, Aadharcard aadharcard) 
{
	super();
	this.mobileNo = mobileNo;
	this.emailId = emailId;
	this.aadharcard = aadharcard;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Aadharcard getAadharcard() {
	return aadharcard;
}
public void setAadharcard(Aadharcard aadharcard) {
	this.aadharcard = aadharcard;
}
   
   
}
