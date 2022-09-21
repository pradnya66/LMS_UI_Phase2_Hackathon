package base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	ConfigReader cfr = new ConfigReader();
	protected Properties prop = cfr.loadConfig();
	
	public WebDriver launchBrowser() throws Exception  {

		String browser = prop.getProperty("Browser");
		WebDriver driver;
		
		System.out.println("browser is... "+ browser);
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
			
		System.out.println("In Launch brower method");
				 
		if(browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
			else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		return driver;
		
			
				
	}

}
