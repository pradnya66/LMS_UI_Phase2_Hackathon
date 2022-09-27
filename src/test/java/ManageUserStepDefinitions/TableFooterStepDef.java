package ManageUserStepDefinitions;


import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TableFooterStepDef extends BaseClass {
    TestContext testcontext;
    public TableFooterStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

	
	@Given("User is logged on to the LMS website")
	public void User_is_logged_on_to_the_LMS_website() throws Exception {
		 testcontext.getDriver().get(prop.getProperty("baseUrl"));
		   testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		   testcontext.getLoginObj().clickonLogin();
	}
	@When("User lands on Manage User page")
	public void User_lands_on_Manage_User_page() {

		testcontext.getUserObj().clickOnUserBtn();
	}
	@Then("User should see the table footer as In total there are 4 users")
	public void User_should_see_the_table_footer_as_In_total_there_are_4_users() {
	Assert.assertTrue(this.testcontext.getUserObj().isDisplayedPageFooter());
	}
	
}
