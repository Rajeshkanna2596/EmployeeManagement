package com.TechSquare.Employee.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TechSquare.Employee.Model.Employee;

@Repository
public class RepoImpliUsingJdbc implements RepoUsingJdbc {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void AddCustomer(Employee employee) throws Exception{
		String query="insert into employee(employee_name,employee_id,employee_address,employee_contact_number)values(?,?,?,?)";
		jdbcTemplate.update(query,employee.getEmployeeName(),employee.getEmployeeId(),employee.getEmployeeAddress(),employee.getEmployeeContectNumber());

}
	public void updatecustomer (Employee employee) throws Exception{
		String query="update employee set employee_name=?,employee_address=?,employee_contact_number=? where employee_id=?";
		jdbcTemplate.update(query,employee.getEmployeeName(),employee.getEmployeeAddress(),employee.getEmployeeContectNumber(),employee.getEmployeeId());
	}
	
	public void deletecustomer (int employee_id) throws Exception{
		String query="delete from employee where employee_id=?";
		jdbcTemplate.update(query,employee_id);
	}
	 
}