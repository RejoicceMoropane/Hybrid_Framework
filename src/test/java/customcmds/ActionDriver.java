package customcmds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import config.StartBrowser;
import freemarker.core.ReturnInstruction.Return;

public class ActionDriver {
	
	WebDriver driver;
	
	
	public ActionDriver()
	{
		//Get instance of browser instance
		driver = StartBrowser.driver;
		
	}
	
	/**
	 * Launch Application
	 * @param url --Application URL
	 * Example -- https://www.ilabquality.com/
	 */
	
	public void launchApplication(String url)
	{
	
		driver.get(url);
	}
	
	/**
	 * Perform click operation on links, button. radio buttons, check box
	 * @param locator --Get it from OR, HomePage.lnkCareers
	 */
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	
	/**
	 * 
	 * @param locator --Get it from OR, HomePage.lnkCareers
	 * @param testData -- Get it from Excel File
	 */
	public void type(By locator, String testData) {
		
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(testData);
		
	}
	public String getText(By locator) {
		String validationText = driver.findElement(locator).getText();
		return validationText;
	}

}
