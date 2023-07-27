package com.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.ems.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	Connection con=null;
	java.sql.PreparedStatement pstmt;
	public EmployeeDaoImpl() throws SQLException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","root");
	}

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Add employee details");
		try {
		pstmt=(PreparedStatement)con.prepareStatement("insert into employees values(?,?,?,?,?,?,?)");
		pstmt.setInt(1,emp.getEmployeeid());
		pstmt.setString(2, emp.getFirst_name());
		pstmt.setString(3, emp.getLast_name());
		pstmt.setInt(4,emp.getAge());
		pstmt.setString(5,emp.getDepartment());
		pstmt.setDouble(6, emp.getSalary());
		pstmt.setString(7, emp.getHire_date());
		pstmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public void getEmployeeList() {
		// TODO Auto-generated method stub
		try {
		pstmt=con.prepareStatement("select * from employees");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDouble(6)+" "+rs.getString(7));
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void getEmployeeId(int id) {
		// TODO Auto-generated method stub
		try {
		pstmt=con.prepareStatement("select * from employees where employeeid=?");
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
	while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDouble(6)+" "+rs.getString(7));
	}
		
			
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		try {
		pstmt=con.prepareStatement("delete from employees where employeeid=?");
		pstmt.setInt(1, id);
		int i=pstmt.executeUpdate();
		if(i!=0) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateEmployeeById(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=con.prepareStatement("update employees set department='Singing' where employeeid=?");
			pstmt.setInt(1, id);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Updated");
			}else {
				System.out.println("not updated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateEmployeeByName(String name) {
		// TODO Auto-generated method stub
		try {
			pstmt=con.prepareStatement("update employees set first_name='Hey boi' where department=?");
			pstmt.setString(1, name);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Name Updated");
			}else {
				System.out.println("Name not updated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void displayAscendingOrder() {
		// TODO Auto-generated method stub
		try {
			pstmt=con.prepareStatement("select * from employees order by department asc");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDouble(6)+" "+rs.getString(7));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void getEmployeeByAge20and30(int age1, int age2) {
		// TODO Auto-generated method stub
		try {
			pstmt=con.prepareStatement("select * from employees where age between ? and ?");
			pstmt.setInt(1,age1);
			pstmt.setInt(2,age2);
			ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDouble(6)+" "+rs.getString(7));
		}
			
				
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
