package Reuse;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import ObjectRepository.CareersPage;
import ObjectRepository.HomePage;
import customcmds.ActionDriver;

public class CommonFunctions {
	
	
	public ActionDriver aDriver;
	
	
	public CommonFunctions() {
		
		aDriver = new ActionDriver();
		
	}
	
	/**
	 * Code Reusability --- Current Opening in South Africa
	 */
	public void CareersSouthAfrica() {
		
		 ActionDriver aDriver = new ActionDriver();
		  aDriver.launchApplication("https://www.ilabquality.com/");
		  aDriver.click(HomePage.lnkCareers);
		  aDriver.click(CareersPage.lnkCountry);
		  
	}
	
	
	public String createRandomInteger(){
		
		
		System.out.println("random number generation"); Random obj= new Random(); 
		//create object for random class 
		//get random number with in the range of 0-9
		String cellnum = "0";
		for (int i =0; i<9; i++) {
			int rgen1= obj.nextInt(9);
		    cellnum += ""+rgen1;
		
		}
		System.out.println(cellnum);
		//Using Regular Expression to format generated phone Number
		String Output = cellnum.replaceAll("(\\d{3})(\\d{3})(\\d{4})","$1 $2 $3"); 
		return Output;
	  }
	
	
	
	
	
	
	

}
