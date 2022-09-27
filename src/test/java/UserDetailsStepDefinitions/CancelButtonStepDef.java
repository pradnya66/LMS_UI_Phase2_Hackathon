package UserDetailsStepDefinitions;

import org.testng.Assert;


import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelButtonStepDef extends BaseClass {
    TestContext testcontext;
    public CancelButtonStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

	   
	@Given("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getHomeObj().clickonUserTab();

	}
	@When("User clicks Add new user button on the page")
	public void User_clicks_Add_new_user_button_on_the_page() {

		testcontext.getUserObj().clickOnAddNewUserBtn();

	}

	@Then("User should see a button with text Cancel in user details window")
	public void User_should_see_a_button_with_text_Cancel_in_user_details_window() {
	Assert.assertTrue(testcontext.getUserObj().isDispalyedCancelBtn());

	}

}
