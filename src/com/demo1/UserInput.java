package com.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput {
	PreparedStatement prs=null;
	Connection connection=null;
	public void insertStudentDetails(String stud_name,String stud_city)
	{
		ConnectionTest con=new ConnectionTest();
		try {
			connection=con.getConnectionDetails();
			prs=connection.prepareStatement("insert into student(stud_name,stud_city) values(?,?)");
			prs.setString(1, stud_name);
			prs.setString(2, stud_city);
			int i=prs.executeUpdate();
			System.out.println("Record insert sucessfully"+i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<2;i++)
		{
			System.out.println("Enter the student name");
			String stud_name=scan.next();
			System.out.println("Enter the student city");
			String stud_city=scan.next();
			UserInput ui=new UserInput();
			ui.insertStudentDetails(stud_name, stud_city);
		}
		
		scan.close();
	}
	
}

