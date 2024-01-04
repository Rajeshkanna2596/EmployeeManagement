package com.TechSquare.Employee.Service;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TechSquare.Employee.Model.Employee;
import com.TechSquare.Employee.Repository.RepoImpliUsingJdbc;

@Service
@Transactional
public class ServiceImpliUsingJdbc implements ServiceUsingJdbc {
	@Autowired
	private RepoImpliUsingJdbc repoimplis;
	@Override
	public void addcustomer(Employee employee) throws Exception{
		repoimplis.AddCustomer(employee);
	}
		@Override
	public void updatecustomer(Employee employee) throws Exception{
		repoimplis.updatecustomer(employee);
	}
		@Override
		public void deletecustomer(int employee_id) throws Exception{
			repoimplis.deletecustomer(employee_id);
		}
		
	


}