package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Action;
import base.BaseClass;

public class HomePage extends BaseClass {
	WebDriver driver;
	Action action = new Action();

	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	private By MenuBarHeading = By.xpath("//span[text()= ' LMS - Learning Management System ']");
	private By ProgramBtn = By.xpath("//button/span[text()='Program']");
	private By BatchBtn = By.xpath("//button/span[text()='Batch']");
	private By UserBtn = By.xpath("//button/span[text()='User']");
	private By AssignmentBtn = By.xpath("//button/span[text()='Assignment']");
	private By AttendanceBtn = By.xpath("//button/span[text()='Attendance']");
	private By LogOutBtn = By.xpath("//button/span[text()='Logout']");
	
	private By menubarBtnsList = By.xpath("//button/span[@class='mat-button-wrapper']");
	
//	private By loginbtn = By.id("login");
	
	public String getLoginPageTitle() {
		return action.getTitle(driver);
		}
	
	public String getMenuBarHeading() throws Exception {
		return action.getText(MenuBarHeading,driver);
	}
	
	public String getProgramBtnText() throws Exception {
		return action.getText(ProgramBtn,driver);
	}
	
	public String getBatchBtnText() throws Exception {
		return action.getText(BatchBtn,driver);
	}
	
	public String getUserBtnText() throws Exception {
		return action.getText(UserBtn,driver);
	}
	
	public String getAssignmentBtnText() throws Exception {
		return action.getText(AssignmentBtn,driver);
	}
	
	public String getAttendanceBtnText() throws Exception {
		return action.getText(AttendanceBtn,driver);
	}
	
	public String getLogoutBtnText() throws Exception {
		return action.getText(LogOutBtn,driver);
	}
	
	public   List<WebElement> menubarBtnsTextList() {
		 List<WebElement> menubarButtons = action.findElements(menubarBtnsList, driver);
		 
//		  for (int i = 0; i < menubarButtonsTexts.size(); i++) {
//		        System.out.println(menubarButtonsTexts.get(i).getText());
//		    }
		 for(WebElement menubarButton: menubarButtons  ) {
			String menubarButtonText  =menubarButton.getText();
			 System.out.println("menubarButtonsText ="  +menubarButtonText);
		 }
		 
		 
		return menubarButtons;
		 
	}
	
	public void clickonAssignmentTab()
	{
		driver.findElement(AssignmentBtn).click();
	}
	
	public void clickonUserTab()
	{
		driver.findElement(UserBtn).click();
	}
	
	
	

	
//	public void clickonLogin() {
//		action.click(loginbtn, driver);
//		
//	}
	
	


}
