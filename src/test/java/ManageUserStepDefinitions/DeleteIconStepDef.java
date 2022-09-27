package ManageUserStepDefinitions;



import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DeleteIconStepDef extends BaseClass {
    TestContext testcontext;
    public DeleteIconStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

	
	@Given("User is on the manage user page")
	public void user_is_on_the_manage_user_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getHomeObj().clickonUserTab();
	}

	@When("User is on the Manage user page after clicking User Tab")
	public void User_is_on_the_Manage_user_page_after_clicking_User_Tab() {
		testcontext.getUserObj().clickonDelete();
	}
	@Then("User should see the delete icon at the top left corner of the user table")
	public void User_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
	    Assert.assertTrue(testcontext.getUserObj().isDispalyedDeleteIcon());

	}

}