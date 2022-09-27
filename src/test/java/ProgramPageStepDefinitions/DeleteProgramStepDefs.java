package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteProgramStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public DeleteProgramStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	

	@When("User clicks on <Delete> button")
	public void user_clicks_on_delete_button() {
		  testcontext.getProgramObj().clickDelete();
	    
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() throws Exception {
		Thread.sleep(5000);
		String ActDelConfirmText =testcontext.getProgramObj().getDisplayedDelDilBoxConftext();
		   System.out.println("delete confirmation is opened: "+ActDelConfirmText);
		   Assert.assertEquals(ActDelConfirmText, "Confirm");
	    
	}

	@Given("User is on Confirm Program page Deletion form")
	public void user_is_on_confirm_program_page_deletion_form() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickDelete();
	    
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() throws Exception {
		Thread.sleep(3000);
		 testcontext.getProgramObj().clickDeleteYes();
		 System.out.println("clicked Yes ");
	    
	}

	@Then("User can see {string} message for Program Page")
	public void user_can_see_message_for_program_page(String expAlert) throws Exception {
		Thread.sleep(1000);
		String actAlert = testcontext.getProgramObj().getMessageText();
		System.out.println("Expected:" + expAlert + "&  Actual:" + actAlert);
		Assert.assertEquals(actAlert, expAlert);
	    
	}

	@When("User clicks <No> button")
	public void user_clicks_no_button() throws InterruptedException {
		Thread.sleep(3000);
		 testcontext.getProgramObj().clickDeleteNo();
		 System.out.println("clicked Yes ");
	    
	}
	@Then("User can see Confirm Deletion form disappears should see {string} page")
	public void user_can_see_confirm_deletion_form_disappears_should_see_page (String ExpManProgText) throws InterruptedException {
		Thread.sleep(1000);
		String ActManProgText = testcontext.getProgramObj().getManageProgramText();
		System.out.println("Expected:" + ExpManProgText + "&  Actual:" + ActManProgText);
		Assert.assertEquals(ActManProgText, ExpManProgText);
	    
	}
}
