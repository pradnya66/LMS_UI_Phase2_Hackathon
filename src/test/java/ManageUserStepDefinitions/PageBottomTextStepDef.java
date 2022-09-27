package ManageUserStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPage;

public class PageBottomTextStepDef extends BaseClass {
    TestContext testcontext;
    public PageBottomTextStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

	
	
    @Given("User is logged into the main LMS website page")
	public void User_is_logged_into_the_main_LMS_website_page() throws Exception {
    	testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		
    }
	@When("User is on Manage User page after clicking user tab")
	public void User_is_on_Manage_User_page_after_clicking_user_tab() {
		testcontext.getHomeObj().clickonUserTab();
		testcontext.getUserObj().getBottomText();

	}
	@Then("User should see the text Showing 1 to 4 of 4 entries below the user table")
	public void User_should_see_the_text_Showing_1_to_4_of_4_entries_below_the_user_table () {

	Assert.assertTrue(this.testcontext.getUserObj().isDisplayedBottomText());
	}

	
}
