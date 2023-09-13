package com.sri.model;

public class Department 
{
      private int departmentNo;
      private String name;
      private String location;
      Employee[] employees;
      public Department() {}
	public Department(int departmentNo, String name, String location, Employee[] employees) 
	{
		this.departmentNo = departmentNo;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
      
}
