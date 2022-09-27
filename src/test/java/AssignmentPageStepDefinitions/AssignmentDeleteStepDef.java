package AssignmentPageStepDefinitions;

import org.testng.Assert;

import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentDeleteStepDef {

	TestContext testcontext;

	public AssignmentDeleteStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	@When("User clicks on Delete button -AssignmentPage")
	public void user_clicks_on_delete_button_assignment_page() {
	  testcontext.getAssignmentObj().clickDelete();
	}

	@Then("User should see the Confirm Deletion form -AssignmentPage")
	public void user_should_see_the_confirm_deletion_form_assignment_page() {
	   boolean flag=testcontext.getAssignmentObj().isDisplayedDelConf();
	   System.out.println("delete confirmation is opened: "+flag);
	   Assert.assertEquals(flag, true);
	}
	

	@When("User clicks on Yes -AssignmentPage")
	public void user_clicks_on_yes_assignment_page() {
	    testcontext.getAssignmentObj().clickDeleteYes();
	}

	@Then("User should see {string} message -AssignmentPage")
	public void user_should_see_message_assignment_page(String expAlert) {
		String actAlert = testcontext.getAssignmentObj().getAlertText();
		System.out.println("Expected:" + expAlert + "&  Actual:" + actAlert);
		Assert.assertEquals(actAlert, expAlert);
	}
	
	@When("User clicks on No -AssignmentPage")
	public void user_clicks_on_no_assignment_page() {
		testcontext.getAssignmentObj().clickDeleteNo();
	}

	@Then("User can see Confirm Deletion form disappears -AssignmentPage")
	public void user_can_see_confirm_deletion_form_disappears_assignment_page() {
	    boolean flag = testcontext.getAssignmentObj().isDisplayedDelConf();
	    Assert.assertEquals(flag,false);
	}
	
}
