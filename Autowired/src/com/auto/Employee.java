package com.auto;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empID;
	private String name;
	private String dept;
	private Department department;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Autowired
	public void Display_Employee_Info() {
		System.out.println("Employee id " +empID);
		System.out.println("Name : "+name);
		System.out.println("Dept type : "+dept);
		department.DisplayDepartment(dept);
	}

}