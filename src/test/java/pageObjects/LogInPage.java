package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.Action;
import base.BaseClass;

public class LogInPage extends BaseClass{
	
	WebDriver driver;
	Action action = new Action();

	public LogInPage(WebDriver driver){
		this.driver = driver;
	}

	private By Username = By.id("username");
	private By Password = By.id("password");
	private By loginbtn = By.id("login");
	
	public String getLoginPageTitle() {
		return action.getTitle(driver);
		}
	
	public void enterValidloginDetails() throws Exception {
			
		System.out.println("username" + prop.getProperty("userName"));
		Thread.sleep(10000);
	
		action.type(Username,driver, prop.getProperty("userName"));
		Thread.sleep(10000);
		
		action.type(Password,driver,prop.getProperty("password"));
				
		System.out.println("entered valid details");
	
	}
	
	public void clickonLogin() {
		action.click(loginbtn, driver);
		
	}
	
	

}
