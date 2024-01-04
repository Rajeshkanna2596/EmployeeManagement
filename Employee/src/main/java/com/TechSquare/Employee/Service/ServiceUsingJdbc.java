package com.TechSquare.Employee.Service;

import com.TechSquare.Employee.Model.Employee;

public interface ServiceUsingJdbc  {
 public void addcustomer (Employee employee) throws Exception;
 public void updatecustomer(Employee employee) throws Exception;
 public void deletecustomer(int employee_id) throws Exception;
}
