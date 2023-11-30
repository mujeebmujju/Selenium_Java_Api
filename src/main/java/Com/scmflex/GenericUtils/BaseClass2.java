package Com.scmflex.GenericUtils;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

	public class BaseClass2 extends WebDriverUtils
	{
		public FileUtils fLib=new FileUtils();
		public JavaUtils jLib=new JavaUtils();
		public DatabaseUtils dLib=new DatabaseUtils();
		public ExcelUtils eLib=new ExcelUtils();
		public WebDriverUtils wLib=new WebDriverUtils();
		public WebDriver driver;
		
         @Parameters({"BROWSER","URL"})
		@BeforeMethod
		public void config_BC(String BROWSER,String URL) throws Throwable
		{
			//String BROWSER=fLib.readDataFromPropertyFile("browser");
		    if (BROWSER.equalsIgnoreCase("chrome"))
		    {
		    	driver=new ChromeDriver();	
			}
		     
		    else if (BROWSER.equalsIgnoreCase("firefox")) 
		    {
		    	driver=new FirefoxDriver();
			}
		    
		   
		    wLib.maximizewindow(driver);
		    System.out.println("----browser launched---");
		    driver.get(URL);
		}
         
         @AfterMethod
         public void config_AM()
         {
        	 driver.manage().window().minimize();
        	 driver.quit();
         }
         
		

}
