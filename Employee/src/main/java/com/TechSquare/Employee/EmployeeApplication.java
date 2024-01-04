package com.TechSquare.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TechSquare.Employee.Controller.ControllerUsingJdbc;
import com.TechSquare.Employee.Model.Employee;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner{
	@Autowired
	private ControllerUsingJdbc controllers;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
    	addEmployee();
		//updateEmployee();
		//deleteEmployee();
	}
	public void addEmployee() throws Exception{
		Employee employee = new Employee();
		employee.setEmployeeName("RajshKanna");
		employee.setEmployeeId(1102);
		employee.setEmployeeAddress("Kumbakonam");
		employee.setEmployeeContectNumber(8903548488l);
		controllers.addcustomer(employee);
		System.out.println("Added Sucessfully");
	}
	public void updateEmployee()throws Exception{
		Employee employee = new Employee();
		employee.setEmployeeName("Rajesh");
		employee.setEmployeeId(1102);
		employee.setEmployeeAddress("chennai");
		employee.setEmployeeContectNumber(9486463674l);
		controllers.updatecustomer(employee);
		System.out.println("update sucessfully");
}
	public void deleteEmployee() throws Exception{
		controllers.deletecustomer(1102);
		System.out.println("delete sucessfully");
	}
}
