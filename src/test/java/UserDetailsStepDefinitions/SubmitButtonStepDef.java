package UserDetailsStepDefinitions;


import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPage;

public class SubmitButtonStepDef extends BaseClass {
    TestContext testcontext;
    public SubmitButtonStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
	
	   public UserPage up;
	@Given("User is on Manage user page after logging")
	public void User_is_on_Manage_user_page_after_logging() {
		 testcontext.getDriver().get(prop.getProperty("baseUrl"));
	}
@When("User clicks A Add new user button")
	public void User_clicks_A_Add_new_user_button() {
	    up.clickOnAddNewUserBtn();
	}

@Then("User should see a button with text Submit in user details window")
	public void User_should_see_button_with_text_Submit_in_user_details_window() {
	   Assert.assertTrue(this.up.isDispalyedSubmitBtn());
	}
	
}
