package base;


import org.openqa.selenium.WebDriver;
import pageObjects.LogInPage;

public class TestContext {

	   protected WebDriver driver;;
		public LogInPage loginObj;
		
		
		public LogInPage getLoginObj() {
			System.out.println("Inside getLoginObj");
			return loginObj;
		}
	
		public WebDriver getDriver() {
			return driver;
		}
		
		public void setDriver( WebDriver driver) {
			this.driver = driver;
		}
		
		
		public void InitializePageObject(WebDriver driver){
			System.out.println("Inside InitializePageObject");
			loginObj = new LogInPage(driver);
			
		}

	}



