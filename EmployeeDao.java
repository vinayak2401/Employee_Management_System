package com.ems.dao;

import com.ems.entity.Employee;

public interface EmployeeDao {
	boolean addEmployee(Employee emp);
	void getEmployeeList();
	void getEmployeeId(int id);
	void deleteEmployeeById(int id);
	void updateEmployeeById(int id);
	void updateEmployeeByName(String name);
	void displayAscendingOrder();
	void getEmployeeByAge20and30(int age1,int age2);

}
