package ManageUserStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPage;

public class ManageUserPageStepDef extends BaseClass {
    TestContext testcontext;
    public ManageUserPageStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
	

	
	
	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() throws Exception {

		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();

	}

	@When("User clicks the Tab User")
	public void User_clicks_the_Tab_User() {
		testcontext.getUserObj().clickOnUserBtn();

}

	@Then("User should see the Manage user page {string}")
		public void User_should_see_the_Manage_user_page(String expHeading) {
		String Actheading = testcontext.getUserObj().getManageUsertext();
		Assert.assertEquals(Actheading, expHeading);
		

}
}
