package LogInPageStepDefinitions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LogInStepDefs extends BaseClass {
    TestContext testcontext;
    public LogInStepDefs(TestContext testcontext) {
        this.testcontext = testcontext;
    }
    
	@Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
			
		testcontext.setDriver(driver);
		
//		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.InitializePageObject(testcontext.getDriver());
		
	}
    @Given("User is on the browser loginPage")
    public void user_is_on_the_browser_loginPage() throws Exception {
        System.out.println("User is on browser");

    }
    @When("User opens the LMS Website")
    public void user_opens_the_lms_website() {
        testcontext.getDriver().get(prop.getProperty("baseUrl"));
    }

    @Then("User should see the Login page {string}")
    public void user_should_see_the_login_page(String exptitle) {
        String Acttitle = testcontext.loginObj.getTitleLoginPage();
        System.out.println("Title got loaded is " + Acttitle);
        Assert.assertEquals(Acttitle, exptitle);
        System.out.println("User is on login Page");
    }

    @Given("User is on the Login Page")
    public void user_is_on_the_login_page() {
//        System.out.println("Opened Browser");
//        WebDriver driver = null;
//        try {
//            driver = launchBrowser();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        testcontext.getDriver().get(prop.getProperty("baseUrl"));
    }

    @When("User clicks the Login button after entering invalid {string}")
    public void user_clicks_the_login_button_after_entering_invalid(String invalidPassword) throws InterruptedException {
        testcontext.getLoginObj().shouldShowInvalidPassword(invalidPassword);
        testcontext.getLoginObj().clickonLogin();
    }

    @Then("User should receive the message {string}")
    public void user_should_receive_the_message(String expTitle) {
        String ActTitle = testcontext.loginObj.getInvalidLoginErrorMessage();
        System.out.println("Title got loaded is " + ActTitle);
        Assert.assertEquals(ActTitle, expTitle);
        System.out.println("User is on login Page");
    }
    @When("User clicks the Login button after entering invalid username")
    public void user_clicks_the_login_button_after_entering_invalid_username(String invalidusername) throws InterruptedException {
        testcontext.getLoginObj().shouldShowInvalidUsername(invalidusername);
        testcontext.getLoginObj().clickonLogin();
    }

    @When("User clicks the Login button after entering valid username and password")
    public void user_clicks_the_login_button_after_entering_valid_username_and_password() throws Exception {
        testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
        testcontext.getLoginObj().clickonLogin();
    }

    @Then("User should see the LMS Home page {string}")
    public void user_should_see_the_lms_home_page(String expTitle) {
        String ActTitle = testcontext.loginObj.getTitleLMSHomePage();
        System.out.println("Title got loaded is " + ActTitle);
        Assert.assertEquals(ActTitle, expTitle);
        System.out.println("User is on login Page");
    }
    
    @After
	public void teardown()
	{
		System.out.println("quiting the driver...");
		testcontext.getDriver().quit();
	}

}
