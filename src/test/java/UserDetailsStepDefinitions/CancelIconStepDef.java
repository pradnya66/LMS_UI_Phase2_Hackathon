package UserDetailsStepDefinitions;


import org.testng.Assert;


import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelIconStepDef extends BaseClass {
    TestContext testcontext;
    public CancelIconStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
	
	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getHomeObj().clickonUserTab();

	}
	@When("User clicks on A Add new user button")
	public void User_clicks_on_A_Add_new_user_button() {
    testcontext.getUserObj().clickOnAddNewUserBtn();

	}

	@Then("User should see a cancel X in user details window")
	public void User_should_see_a_cancel_X_in_user_details_window() {
	Assert.assertTrue(this.testcontext.getUserObj().isDispalyedUserCancel());


	}


}
