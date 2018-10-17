package ObjectRepository;

import org.openqa.selenium.By;

public class ApplicationPage {
	
	public static By lnkApplyOnline = By.cssSelector("#wpjb-scroll > div:nth-child(1) > a");
	public static By txtName = By.id("applicant_name");
	public static By txtEmail = By.id("email");
	public static By txtPhone = By.id("phone");
	public static By btnSendApplication = By.id("wpjb_submit");
	public static By txtError = By.className("wpjb-errors");
	

}
