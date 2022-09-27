package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramPagePaginationStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public ProgramPagePaginationStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	
	@Then("Verify that previous link is disabled -ProgramPage")
	public void verify_that_previous_link_is_disabled_program_page() {
		boolean actflag = testcontext.getProgramObj().previousLinkisDisabled();
		System.out.println("actflag = "  +actflag);
		Assert.assertEquals(actflag, false);
	   
	}

	@Given("User is on the page number one -ProgramPage")
	public void user_is_on_the_page_number_one_program_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickOnpageoneBtn();
	   
	}

	@When("User clicks navigate > forward button -ProgramPage")
	public void user_clicks_navigate_forward_button_program_page() {
		testcontext.getProgramObj().clickOnNextLink();
	  
	}

	@Then("User navigated to page number two -ProgramPage")
	public void user_navigated_to_page_number__two_program_page() {
		boolean Actflag = testcontext.getProgramObj().page2BtnisEnabled();
		System.out.println("actflag = "  +Actflag);
		Assert.assertEquals(Actflag, true);
	   
	}

	@Given("User is on page number two -ProgramPage")
	public void user_is_on_page_number_two_program_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickOnpagetwoBtn();
	   
	}
	
	@When("User clicks navigate < backward button -ProgramPage")
	public void user_clicks_navigate_backward_button_program_page() {
		testcontext.getProgramObj().clickOnPreviousLink();
	}
	
	@Then("User navigated to page number one -ProgramPage")
	public void user_navigated_to_page_number__one_program_page() {
		boolean Actflag = testcontext.getProgramObj().page1BtnisEnabled();
		System.out.println("actflag = "  +Actflag);
		Assert.assertEquals(Actflag, true);
	   
	}
	@When("User is on last page of Manage Program -ProgramPage")
	public void user_is_on_last_page_of_manage_program_program_page() {
		testcontext.getProgramObj().clickOnLastPageLink();
	   
	}

	@Then("Verify that next link is disabled -ProgramPage")
	public void verify_that_next_link_is_disabled_program_page() {
		boolean Actflag = testcontext.getProgramObj().nextLinkisDisabled();
		System.out.println("actflag = "  +Actflag);
		Assert.assertEquals(Actflag, false);
	   
	}

}
