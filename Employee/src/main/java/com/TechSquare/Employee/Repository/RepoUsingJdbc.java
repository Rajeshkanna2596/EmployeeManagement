package com.TechSquare.Employee.Repository;

import com.TechSquare.Employee.Model.Employee;

public interface RepoUsingJdbc {
	public void AddCustomer(Employee employee) throws Exception;
	public void updatecustomer (Employee employee) throws Exception;
	public void deletecustomer (int employee_id) throws Exception;
}
