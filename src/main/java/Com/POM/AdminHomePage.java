package Com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage
{

	//Declare the WebElement
    @FindBy(xpath="//a[.='Products']")
	private WebElement productlink; 
	
	@FindBy(xpath="//a[.='Add Retailers']")
	private WebElement AddRetailerslink; 
	
	@FindBy(xpath="//a[.='Retailers']")
	private WebElement Retailerslink; 
	
    
	//Initialize the WebElement

    public AdminHomePage(WebDriver driver)
    {
	PageFactory.initElements(driver, this);
	
    }

    
	//Utiliztaion of WebElement

    public WebElement getProductlink() 
    {
	return productlink;
    }


    public WebElement getAddRetailerslink() 
    {
	return AddRetailerslink;
    }


    public WebElement getRetailerslink() 
    {
	return Retailerslink;
    }
    
    //Business Logic
    
    public void ClickOnproductLink()
    {
    	productlink.click();
    }

    
}


