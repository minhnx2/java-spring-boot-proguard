package com.example.demo.models;

public class Employee extends Person {

	String employeeDesignation;

	public Employee(String f, String e, String d) {
		super(f, e);
		employeeDesignation = d;
	}

	@Override
	public String toString() {
		return "Employee [employeeDesignation=" + employeeDesignation + "]";
	}

}