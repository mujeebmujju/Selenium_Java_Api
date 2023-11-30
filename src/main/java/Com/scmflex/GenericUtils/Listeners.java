package Com.scmflex.GenericUtils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener

{
	ExtentReports report;
	ExtentTest test;
	
	WebDriverUtils wLib=new WebDriverUtils();
	//WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"---Test script execution starts from here---");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"--->PASSED");
		Reporter.log(MethodName+"---Test script executed successfully---");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String Fs=result.getMethod().getMethodName();
		String Failedscript = Fs+new JavaUtils().systemDateInFormat();
		test.addScreenCaptureFromPath(Failedscript);
		
		try 
		{
			wLib.getScreenShot(BaseClass.sdriver, Fs);	
		} 
		catch (Throwable e)
		{
			e.printStackTrace();
		
		}
		
		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL, Failedscript+"----Failed");
		Reporter.log(Failedscript+"----Script Failed");
     }

	@Override
	public void onTestSkipped(ITestResult result)
	
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"----skip");
		Reporter.log(MethodName+"----Test script execution is skip");
    }
    
	
	@Override
	public void onStart(ITestContext context) 
	
	{
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Extentreport/report.html");
		htmlreport.config().setDocumentTitle("SDET-52");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("SCM");
		
        report=new ExtentReports();
        report.attachReporter(htmlreport);
        report.setSystemInfo("Base-Browser","chrome");
        report.setSystemInfo("url","http://rmgtestingserver/domain/Supply_Chain_Management/");
        report.setSystemInfo("Reporter Name","Mujeeb");
     }
	

	@Override
	public void onFinish(ITestContext context) 
	{
		//consolidate the report/clean the old report
		report.flush();

	}
	

}
