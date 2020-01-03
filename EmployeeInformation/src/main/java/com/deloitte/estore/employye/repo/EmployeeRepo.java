package com.deloitte.estore.employye.repo;

import java.sql.Connection;
import java.util.List;

import com.deloitte.estore.employee.model.Employee;

public interface EmployeeRepo {

	boolean addEmployee(Employee emp) throws Exception;
	boolean updateEmployee(Employee emp) throws Exception;
	boolean deleteEmployee(Employee emp) throws Exception;
	Employee getEmployeeById(int empId) throws Exception;
	List<Employee> getAllEmployees() throws Exception;
	Connection getDbConnection() throws Exception;
}
