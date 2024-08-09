package com.spring;
import org.springframework.beans.factory.annotation.Required;
public class Employee {
	public int empId;
	public String name;
	public String designation;
	public String dept;
	public int getEmpId() {
		return empId;
	}
	@Required
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	@Required
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	@Required
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
