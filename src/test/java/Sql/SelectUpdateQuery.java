 package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectUpdateQuery 
{
	public static void main(String[] args) throws SQLException 
	{
		//register the driver
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//get connection of database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sdet52","root","root");
		
		// create statement
		Statement state = con.createStatement();
		String query="insert into student_info values('sam','CE',15);";
		
		//execute updatequery
		int result = state.executeUpdate(query);
		
		if (result==1) 
		{
			System.out.println("Data inserted succesfully...");
			
		}
		else
		{
			System.out.println("Data is not inserted...");
			
		}
		
		//close database
		con.close();
		}
		
		
		
	}

