package config;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class StartBrowser {

	public static WebDriver driver;
	


  @BeforeClass
  public void beforeClass() {
	  
	  
	//Initiate browser instance using Chrome Driver
	System.setProperty("webdriver.chrome.driver", "C:\\AutomationsTools\\chromedriver_win32 (3)\\chromedriver.exe");
	ChromeOptions ChromeOptions = new ChromeOptions();
	//Maximize Window
	ChromeOptions.addArguments("--start-maximized");
	driver = new ChromeDriver(ChromeOptions);
	
	  
  }

  @AfterClass
  public void afterClass() {
	  //Close browser
	 // driver.close();
	  
  }

}
