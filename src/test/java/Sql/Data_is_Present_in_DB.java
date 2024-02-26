package Sql;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Random;
	import java.util.Scanner;

	import com.mysql.cj.jdbc.Driver;
	public class Data_is_Present_in_DB 
	{
		public static void main(String[] args) throws SQLException 
		{
			Scanner sc=new Scanner (System.in);
			 System.out.println("Enter the Emp Name");
			 String Ename = sc.nextLine();
			 
			
			// Random Number 
			Random ran=new Random();
		
			// Register the database
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			// Get DataBase Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52","root","root");
			
			// Create Statement
			Statement state = con.createStatement();
			String Query="select EName from clerk where EName='"+Ename+"';";
			
			//Execute the Query
			ResultSet Result4 = state.executeQuery(Query);
			
			 if(Result4.next())
			{
				System.out.println("Data is present...Please Enter the differnt Emp Name ");
				String Ename1 = sc.nextLine();
				 int ranAge = ran.nextInt(100);
				 String Query1="insert into clerk values('"+Ename1+"',+'"+ranAge+"');";
				 
				// ExecuteUpdate Query
					int result1 = state.executeUpdate(Query1);
					if(result1>=1)
					{
						System.out.println("Data insert sucessfully....");
					}
				
			}
			 else
			 {
				 System.out.println("Data is not present..Please Enter the Emp Name");
				 String Ename1 = sc.nextLine();
				 int ranAge = ran.nextInt(100);
				 String Query1="insert into clerk values('"+Ename1+"','"+ranAge+"');";
				 
				// ExecuteUpdate Query
					int result2 = state.executeUpdate(Query1);
					if(result2>=1)
					{
						System.out.println("Data insert sucessfully....");
					}	
			 }
			 
			 // Create statement
			 String Queryexecute="select * from clerk;";
			 
			 // Execute the Query after insertion
			 Result4=state.executeQuery(Queryexecute);
				
			
			 while(Result4.next())
			 {
				 System.out.println(Result4.getString(1)+"  "+Result4.getInt(2));
			 }
			 
			 //close database
			 con.close();

		}



}
