package com.auto;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientAuto {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee employee_object=(Employee)context.getBean("employee");
		employee_object.Display_Employee_Info();
	}}