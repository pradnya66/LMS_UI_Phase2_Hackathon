package ManageUserStepDefinitions;


import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditIconStepDef extends BaseClass {
    TestContext testcontext;
    public EditIconStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
	
	@Given("User is on home page after Login")
	public void user_is_on_home_page_after_login() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getHomeObj().clickonUserTab();

	}

@When("User is on the Manage user page after clicking User button")
	public void User_is_on_the_Manage_user_page_after_clicking_User_button() {
	testcontext.getUserObj().clickonUserEditBtn();
}

@Then("User should see the edit button on the page")
	public void User_should_see_the_edit_button_on_the_page() {
    Assert.assertTrue(testcontext.getUserObj().isDispalyedEditIcon());

}

}