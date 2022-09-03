package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Customer;
import com.example.demo.models.Employee;
import com.example.demo.models.Features;
import com.example.demo.models.Flight;
import com.example.demo.models.Seat;

@SpringBootApplication
public class DemoProguardApplication {

	private static Customer customer;
	private static Employee employee;
	private static Features features;
	private static Flight flight;

	public static void main(String[] args) {
		SpringApplication.run(DemoProguardApplication.class, args);

		System.out.println("Hello World!");

		StringUtil stringUtil = new StringUtil();
		System.out.println("StringUtil: " + stringUtil.add(1, 1));

		ArrayList<Seat> seats = new ArrayList<>();
		customer = new Customer("a", "b", seats);
		employee = new Employee("a", "b", "c");

		System.out.println("customer: " + customer.toString());
		System.out.println("employee: " + employee.toString());
	}

}
