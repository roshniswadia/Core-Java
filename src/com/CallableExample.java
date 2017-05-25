package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableExample {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root"); 
			CallableStatement callable = con.prepareCall("{call GETCUSTOMERDETAILS(?,?,?)}");
			callable.setInt(1, 1);
			callable.registerOutParameter(2, java.sql.Types.VARCHAR);
			callable.registerOutParameter(3, java.sql.Types.INTEGER);
			
			callable.executeUpdate();
			
			String empName = callable.getString(2);
			Integer salary = callable.getInt(3);
			
			System.out.println("Employee ID : " + 1);
			System.out.println("Employee Name : " + empName);
			System.out.println("Employee Salary : " + salary);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		 
		
	}

}
