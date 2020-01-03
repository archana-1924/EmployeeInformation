package com.deloitte.estore.employye.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.deloitte.estore.employee.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {

	public boolean addEmployee(Employee emp) throws Exception {
		Connection con = getDbConnection();
		PreparedStatement pstmt= con.prepareStatement("insert into employee values (?,?,?)");
		pstmt.setInt(1, emp.getEmpId());
		pstmt.setString(2, emp.getName());
		pstmt.setDouble(2, emp.getSalary());
		return false;
	}

	public boolean updateEmployee(Employee emp) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmployee(Employee emp) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public Employee getEmployeeById(int empId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection getDbConnection() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
