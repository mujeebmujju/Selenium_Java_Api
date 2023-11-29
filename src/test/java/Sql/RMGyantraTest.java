package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RMGyantraTest 
{


public static void main(String[] args) throws SQLException, InterruptedException
{
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.get("http://rmgtestingserver:8084/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//sign into rmg yantra
	driver.findElement(By.name("//label[text()='Username']")).sendKeys("rmgyantra");
	driver.findElement(By.name("//label[text()='Password']")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
	//create project
	driver.findElement(By.xpath("//a[text()='Projects']")).click();
	driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	driver.findElement(By.name("//input[@name='projectName']")).sendKeys("SCMFlex_Mujeeb01");
	driver.findElement(By.name("//input[@name='createdBy']")).sendKeys("Deepak HR");
	WebElement select1 = driver.findElement(By.name("status"));
	Select select=new Select(select1);
	select.selectByVisibleText("created");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//validation in backend
	Driver driver1=new Driver();
	DriverManager.registerDriver(driver1);
	Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
	Statement state = con.createStatement();
    String query="select * from project";
	ResultSet result = state.executeQuery(query);
	boolean flag=false;
	String ExpData = null;
	
	while (result.next())
	{
	 String actual = result.getString(4);
	 
	
	if (actual.equalsIgnoreCase(ExpData)) 
	   {
		flag=true;
		break;
	   }
	}
	 if (flag) 
	 {
		 System.out.println("project created successfully");
	 }
	 else
	 {
		 System.out.println("project is not created");
	 }
}
		

}
