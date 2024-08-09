package com.auto;

public class Department {
	public void DisplayDepartment(String emp_type) {
		if(emp_type.equals("HR"))
			System.out.println("HR Department,Role: Recruitment,Employee Benefits");
		else if (emp_type.equals("Admin"))
            System.out.println("Admin dept : Transportation to employees,food coupons etc.,");			
		else if(emp_type.equals("Technology"))
			System.out.println("Technology dept : Research and development,training");
			
	

}
}