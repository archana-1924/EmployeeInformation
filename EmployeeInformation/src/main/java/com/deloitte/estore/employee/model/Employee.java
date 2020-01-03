package com.deloitte.estore.employee.model;


public class Employee {

	
	private int empId;
	private String eName;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int empId, String eName, double salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]\n";
	}
}
