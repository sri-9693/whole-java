package com.vathsa.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="address")
@NamedQuery(name="getAllAddress",query="from Address2")
public class Address2 
{
	@Id
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="hno")
	private String houseNo;
	
	@Column(name="street")
	private String streetName;
	
	@Column(name="city")
	private String cityName;
	
	@Column(name="state")
	private String stateName;
	
	public Address2()  {}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
