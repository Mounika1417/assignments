package com.spring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Employee obj=(Employee) context.getBean("empBean");
		System.out.println("Printing Employee details..");
		System.out.println("Employee id : " + obj.getEmpId());
		System.out.println("Employee Name : "+ obj.getName());
		System.out.println("Department : "+obj.getDept());
		System.out.println("Designation : "+obj.getDesignation());
	}

}
