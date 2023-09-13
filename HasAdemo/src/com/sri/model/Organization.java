package com.sri.model;

public class Organization 
{
    String orgName;
    String Location;
    Department[] departments;
    public Organization()  {}
	public Organization(String orgName, String location, Department[] departments)
	{
		this.orgName = orgName;
		Location = location;
		this.departments = departments;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Department[] getDepartments() {
		return departments;
	}
	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}
    
}
