package Com.scmflex.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtils
{
	Connection con=null;
	public void connectionDB() throws Throwable
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IPathConstants.DBURL,IPathConstants.DB_Username,IPathConstants.DB_Password);
	}
	
	public String executAndGetData(int colData,String ExpData,String query) throws Throwable
	{
		Statement state = con.createStatement();
		//String query="select * from student_info;";
		 ResultSet result = state.executeQuery(query);
		 boolean flag=false;
		 
		 while(result.next())
		 {
			 String actual = result.getString(colData);
			 
			 if(actual.equalsIgnoreCase(ExpData))
			 {
				 flag=true;
				 break;
			 }
		 }
		 
		 if(flag)
		 {
			 System.out.println("project is created successfully");
			 return ExpData;
		 }
		 else
		 {
			 System.out.println("project is not created");
			 return "";
		 }
		
	}
	
	public void disconnectDB() throws Throwable
	{
		con.close();
	}
		
	
}

