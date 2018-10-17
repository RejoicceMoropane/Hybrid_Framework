package Scripts;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Random;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectRepository.ApplicationPage;
import ObjectRepository.CareersPage;
import ObjectRepository.CurrentOpeningPage;
import ObjectRepository.HomePage;
import Reuse.CommonFunctions;
import Reuse.ExcelUtils;
import config.StartBrowser;
import customcmds.ActionDriver;


public class TC1 extends StartBrowser {
	

	    @Test
	  public void ApplyOnline() throws Exception {
		  
	    try {	
	    	
	     //Instantiating ExcelUtil function class	
		  ExcelUtils utils = new ExcelUtils();
		  ArrayList<String> applicantData= utils.GetDataFile();
		  String name = applicantData.get(0);
		  String email = applicantData.get(1);
		  //Instantiating common function class
		  CommonFunctions commonFunctions = new CommonFunctions();
		  Random aRandom = new Random();
				 
		  
		  ActionDriver aDriver = new ActionDriver();
		  //launch to Test Application
		  aDriver.launchApplication("https://www.ilabquality.com/");
		  //click on the careers link
		  aDriver.click(HomePage.lnkCareers);
		  //click on the Country link(South Africa)
		  aDriver.click(CareersPage.lnkCountry);
		  //click on the Current opening link
		  aDriver.click(CurrentOpeningPage.lnkCurrentOpenning);
		  //Click Apply online and Populate Applicant Details
		  aDriver.click(ApplicationPage.lnkApplyOnline);
		  //populate name 
		  aDriver.type(ApplicationPage.txtName, name);
		  //Populate email 
		  aDriver.type(ApplicationPage.txtEmail, email);
		  //auto generate 10 digit Phone Number
		  aDriver.type(ApplicationPage.txtPhone, commonFunctions.createRandomInteger());
		  //Click on send application button
		  aDriver.click(ApplicationPage.btnSendApplication);
		  //Get String Value
		 String Result= aDriver.getText(ApplicationPage.txtError);
		 
		  String actual = Result;
		  String expectedResult = "You need to upload at least one file.";
		  //Verify that actual result is equal to expected result
		  assertEquals(actual, expectedResult);
		  if(actual.equals(expectedResult)) {
			  
		  }
		  }catch (Exception e) {
			
		}
		  
		 
		 
		  
	  }
  
  
  
  
}
