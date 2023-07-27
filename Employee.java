package com.ems.entity;

public class Employee {
	private int employeeid;
	private String first_name;
	private String last_name;
	private int age;
	private String department;
	private double salary;
	private String hire_date;
	public Employee(int employeeid, String first_name, String last_name, int age, String department, double salary,
			String hire_date) {
		super();
		this.employeeid = employeeid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.hire_date = hire_date;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	

}
