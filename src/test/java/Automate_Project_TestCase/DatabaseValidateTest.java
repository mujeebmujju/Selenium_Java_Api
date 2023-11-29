package Automate_Project_TestCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class DatabaseValidateTest 
{
	

	private static final String EName = null;

	public static void main(String[] args) throws SQLException 
	{
		Random ran = new Random();
		int randomnum = ran.nextInt(100);
		
		//register the driver
				Driver driver=new Driver();
				DriverManager.registerDriver(driver);
				
				//get connection of database
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sdet52","root","root");
				
				// create statement
				Statement state = con.createStatement();
				String query="select Name from employee where Name='"+EName+"';";
				
				//execute query
		          ResultSet result = state.executeQuery(query);
				
				if (result.next())
				{
					System.out.println("Data inserted succesfully...");
					System.out.println(result.getString(1));
					
				}
				else
				{
					System.out.println("Data is not inserted...");
					System.out.println("Enter the employee name and age");
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the name");
					String Name = sc.nextLine();
					int randomnum1 = ran.nextInt(100);
					
					
			  // insert the data
					//String query1="insert into employee("+Name+",+'"+random+"');";
					//int result1 = state.executeUpdate(query1);
					
					//if (condition) {
						
					}
					
					
					
					
				}
				
				//close database
				//con.close();
				}
				
		

