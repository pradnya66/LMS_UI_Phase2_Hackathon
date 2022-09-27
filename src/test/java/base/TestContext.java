package base;


import org.openqa.selenium.WebDriver;
import pageObjects.AssignmentPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.ProgramPage;
import pageObjects.UserPage;

public class TestContext {

	  	protected WebDriver driver;;
	  	public LogInPage loginObj;
		public HomePage homeObj;
		public ProgramPage programObj;
		public AssignmentPage assignmentObj;
		public UserPage userObj;
		
		
		
		public WebDriver getDriver() {
			return driver;
		}
		
		public void setDriver( WebDriver driver) {
			this.driver = driver;
		}
		
		
		
		 public HomePage getHomeObj() {
				return homeObj;
			}
		 
		 public ProgramPage getProgramObj() {
				return programObj;
			}
		 
		 public AssignmentPage getAssignmentObj() {
				return assignmentObj;
			}
		 
		 public LogInPage getLoginObj() {
				return loginObj;
			}
		 
		 public UserPage getUserObj() {
				return userObj;
			}
		 
		 
		 
		 
		 
		 
		
		
		public void InitializePageObject(WebDriver driver){
			System.out.println("Inside InitializePageObject");
			
			homeObj = new HomePage(driver);
			programObj = new ProgramPage(driver);
			assignmentObj =  new AssignmentPage(driver);
			loginObj = new LogInPage(driver);
			
			
		}

	}



