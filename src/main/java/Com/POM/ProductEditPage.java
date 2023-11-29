package Com.POM;



import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductEditPage 
{
	@FindBy(xpath = "//input[@id='product:price']")
	private WebElement pricetextField;
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement enableRadioButton;
	
	@FindBy(xpath = "//input[@value='Update Product']")
	private WebElement updateProductButton;
	
	public ProductEditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPricetextField() 
	{
		return pricetextField;
	}

	public WebElement getEnableRadioButton() 
	{
		return enableRadioButton;
	}

	public WebElement getUpdateProductButton() 
	{
		return updateProductButton;
	}
	
	public void ClickAndClearPricetextField()
	{
		pricetextField.click();
		pricetextField.clear();
	}
	
	public void EnterPriceIntoPriceTextField(HashMap<String, String> map,WebDriver driver)
	   {
		   for(Entry<String, String> set:map.entrySet())
			{
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			}
	   }
	

}


