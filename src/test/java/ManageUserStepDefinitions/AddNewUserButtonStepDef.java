package ManageUserStepDefinitions;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddNewUserButtonStepDef extends BaseClass {
    TestContext testcontext;
    public AddNewUserButtonStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
   public WebDriver driver;
   
   
   @Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
			
		testcontext.setDriver(driver);

		testcontext.InitializePageObject(testcontext.getDriver());
		
	}
	
	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		Thread.sleep(3000);
		testcontext.getUserObj().clickOnUserBtn();
	}

	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
		testcontext.getUserObj().clickOnAddNewUserBtn();
	}

	@Then("User should see the User details dialog box")
	public void user_should_see_the_user_details_dialog_box() {
	    Assert.assertTrue(testcontext.getUserObj().isDispalyedAddNewUser());
	}

}
