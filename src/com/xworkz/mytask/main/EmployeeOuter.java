package com.xworkz.mytask.main;

public class EmployeeOuter {

	String empName = "Mridula";
	String designation = "Software Engineer";

	static class EmployeeInner {

		int id = 6;
	}

	public static void main(String[] args) {
		EmployeeOuter.EmployeeInner empDetails = new EmployeeOuter.EmployeeInner();

		System.out.println(empDetails.id);
	}

}
