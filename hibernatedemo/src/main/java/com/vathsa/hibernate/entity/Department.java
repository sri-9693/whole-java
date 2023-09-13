package com.vathsa.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	@Column(name="deptno")
	private int departmentno;
	
	@Column(name="deptname")
	private String departmentname;
	
	@Column(name="location")
	private String location;
	
//	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name="deptno")
	
	@OneToMany(mappedBy="department")
	List<Employee> employees;

	public Department()  {}

	public Department(int departmentno, String departmentname, String location) {
		super();
		this.departmentno = departmentno;
		this.departmentname = departmentname;
		this.location = location;
	}

	public int getDepartmentno() {
		return departmentno;
	}

	public void setDepartmentno(int departmentno) {
		this.departmentno = departmentno;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
			
	
}
