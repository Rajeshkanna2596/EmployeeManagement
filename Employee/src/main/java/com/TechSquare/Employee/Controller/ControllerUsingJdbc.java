package com.TechSquare.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.TechSquare.Employee.Model.Employee;
import com.TechSquare.Employee.Service.ServiceImpliUsingJdbc;

@Controller
public class ControllerUsingJdbc {
@Autowired
private ServiceImpliUsingJdbc ServiceImplis;
public void addcustomer (Employee employee) throws Exception{
	ServiceImplis.addcustomer(employee);
}
public void updatecustomer (Employee employee) throws Exception{
	ServiceImplis.updatecustomer(employee);
}
public void deletecustomer(int employee_id) throws Exception{
	ServiceImplis.deletecustomer(employee_id);
}
}
