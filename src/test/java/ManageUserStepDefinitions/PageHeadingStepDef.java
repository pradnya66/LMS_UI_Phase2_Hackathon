package ManageUserStepDefinitions;


import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageHeadingStepDef extends BaseClass {
    TestContext testcontext;
    public PageHeadingStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
	
	@Given("User is on lms home page after Login")
	public void user_is_on_lms_home_page_after_login() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
	    
	}

	@When("User is on the Manage user page after clicking User Tab on home page")
	public void User_is_on_the_Manage_user_page_after_clicking_User_Tab_on_home_page() {
	    testcontext.getUserObj().clickOnUserBtn();
	}
@Then("User should see the page heading as Manage User")
	public void User_should_see_the_page_heading_as_Manage_User() {
	Assert.assertTrue(this.testcontext.getUserObj().isDisplayedUserPageHeading());
	}
}
