package Com.scmflex.GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
	
  /**This method is used to maximize window
   * @param driver
   */
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/**This method is used to minimize window
	 * @param driver
	 */
	
	public void minimizewindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	
	/**This method is used to wait until page load
	 * @param driver
	 * @param sec
	 */
   public void implicitlyWait(WebDriver driver,int sec)
   {

	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
   }
   
   
   /**This method is used to wait until the element is to be visible
    * @param driver
    * @param element
    * @param sec
    */
	public void waituntilElementToBeVisible(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	/**This method will wait for 10 sec for an element to be clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	/**This method is used to select drop down using index
	 * @param element
	 * @param index
	 */
	public void dropdown(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**This method is used to select drop down using value
	 * @param element
	 * @param index
	 */
	public void dropdown1(WebElement element,String Value)
	{
		Select sel1=new Select(element);
		sel1.selectByValue(Value);
	}
	
	/**This method is used to select drop down using visible text
	 * @param element
	 * @param index
	 */
	public void dropdown2(WebElement element,String Text)
	{
		Select sel2=new Select(element);
		sel2.selectByVisibleText(Text);
	}
	
	
	/**This method will perform mouseover action
	 * @param driver
	 * @param element
	 */
	public void mousehover(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**This method will perform drag and drop action
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement target)
	{
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(src,target).perform();
	}
	
	/**This method will perform double click on element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act1 = new Actions(driver);
		act1.doubleClick(element).perform();
	}
	
	/**This method will perform double click on webPage
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act1 = new Actions(driver);
		act1.doubleClick().perform();
	}
	
	
	
	/**This method will perform right click on webPage
	 * @param driver
	 */
	public void rightClick(WebDriver driver)
	{
		Actions act1 = new Actions(driver);
		act1.contextClick().perform();
	}
	
	/**This method will perform right click on element
	 * @param driver
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act1 = new Actions(driver);
		act1.contextClick(element).perform();
	}
	
	/**This method will press enter key
	 * @param driver
	 */
	public void enterKeyPress(WebDriver driver)
	{
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.ENTER).perform();
	}
	
	/**This method will  press enter key
	 * @throws AWTException 
	 * @throws Throwable
	 */
	public void enterKey() throws Throwable
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	/**This method is to release the key
	 * @throws AWTException 
	 * @throws Throwable
	 */
	public void enterRelease() throws Throwable
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	/**This method will switch the frame based on index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**This method will switch the frame based on name or id
	 * @param driver
	 * @param nameOrid
	 */
	public void switchToFrame1(WebDriver driver,String nameOrid)
	{
		driver.switchTo().frame(nameOrid);
	}
	
	/**This method will switch the frame based on name or id
	 * @param driver
	 * @param address
	 */
	public void switchToFrame2(WebDriver driver,WebElement address)
	{
		driver.switchTo().frame(address);
	}
	
	/**This method will accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**This method will cancel the alert popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**This method will switch between windows
	 *@param driver
	 *@param partialWInTitle
	 */
	public void switchToWindow(WebDriver driver,String partialWInTitle)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**This method will take screenshot and store it in a folder called as Screenshot
	 * @param driver
	 * @param screenShotName
	 * @param Throwable
	 * @throws Throwable 
	 */
	public String getScreenShot(WebDriver sdriver,String screenShotName) throws Throwable
	{
		TakesScreenshot ts= (TakesScreenshot)sdriver;
		String path=".\\Screenshot\\"+screenShotName+".png";
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(path);
		FileUtils.copyFile(src, dst);
		
		return dst.getAbsolutePath();
	}
	
	/**This method will perform random scroll the Webpage
	 *@param driver
	 */
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
	
	/**This method will scroll untill the specified element is found
	 * @param driver
	 * @param element
	 */
	public void scrollAction(WebDriver driver ,WebElement element )
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}