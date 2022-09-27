package ManageUserStepDefinitions;



import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserIDStepDef extends BaseClass {
    TestContext testcontext;
    public UserIDStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

	
	@Given("User is on manage user page")
	public void User_is_on_manage_user_page() throws Exception {
		 testcontext.getDriver().get(prop.getProperty("baseUrl"));
		   testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		   testcontext.getLoginObj().clickonLogin();
		   testcontext.getUserObj().clickOnUserBtn();

	}

	@When("User clicks ID in any row")
	public void User_clicks_ID_in_any_row() {
	   testcontext.getUserObj().clickonUserLink();
	}

	@Then("User details dialog box displayed with user information")
	public void User_details_dialog_box_displayed_with_user_information() {
	Assert.assertTrue(this.testcontext.getUserObj().isDisplayedUserDetail());

	}
}
