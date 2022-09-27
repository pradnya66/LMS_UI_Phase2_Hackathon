package AssignmentPageStepDefinitions;

import org.testng.Assert;

import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentNewStepDef {
	
	TestContext testcontext;
	public AssignmentNewStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	@When("User clicks on A New Assignment button -AssignmentPage")
	public void user_clicks_on_a_new_assignment_button_assignment_page() {
	   testcontext.getAssignmentObj().clickNewAssign();
	   
	}

	@Then("User land on Assignment Details form -AssignmentPage")
	public void user_land_on_assignment_details_form_assignment_page() {
	  boolean flag = testcontext.getAssignmentObj().isDisplayedAssigDet();
	  Assert.assertEquals(flag, true);
	
	}

	@Then("User land on form with title {string} -AssignmentPage")
	public void user_land_on_form_with_title_assignment_page(String ExpFormTitle) {
	    String actFormTitle = testcontext.getAssignmentObj().getFormTitle();
		Assert.assertEquals(actFormTitle, ExpFormTitle,"correct title is displayed");
	}
	
	

	@When("User clicks on save with out any fields -AssignmentPage")
	public void user_clicks_on_save_with_out_any_fields_assignment_page() throws InterruptedException {
		Thread.sleep(3000);
		testcontext.getAssignmentObj().clickAssignSave();
		System.out.println("Clicked on save with out any fields");
		
	}

	@Then("User should see message {string} -AssignmentPage")
	public void user_should_see_message_assignment_page(String expWarnMsg) {
	      String actWarmMsg = testcontext.getAssignmentObj().getNameReqMsg();
	      Assert.assertEquals(actWarmMsg, expWarnMsg,"Name required msg is displayed");
	}

	// Name field check
	@When("User Enter Assignment Name {string} -AssignmentPage")
	public void user_enter_assignment_name_assignment_page(String AssignName) {
	
		System.out.println("sending name string: " +AssignName);
		testcontext.getAssignmentObj().enterAssignName(AssignName);

	}

	@Then("User should see the name entered -AssignmentPage")
	public void user_should_see_the_name_entered_assignment_page() {
		testcontext.getAssignmentObj().getScreenshot("AssignemntName");
	}

	// Description field check
	@When("User Enter Assignment Description {string} -AssignmentPage")
	public void user_enter_assignment_description_assignment_page(String AssignDescrip) {
		System.out.println("sending name string: " +AssignDescrip);
		testcontext.getAssignmentObj().enterAssignDescri(AssignDescrip);
	}

	@Then("User should see the description entered -AssignmentPage")
	public void user_should_see_the_description_entered_assignment_page() {
		testcontext.getAssignmentObj().getScreenshot("AssignemntDes");
	}
	
	//grade field check
	
	@When("User Enter Assignment grade {string} -AssignmentPage")
	public void user_enter_assignment_grade_assignment_page(String AssignGrd) throws InterruptedException {
		System.out.println("sending name string: " +AssignGrd);
		testcontext.getAssignmentObj().enterAssignGrd(AssignGrd);
		Thread.sleep(2000);
	}

	@Then("User should see the grade entered -AssignmentPage")
	public void user_should_see_the_grade_entered_assignment_page() {
		testcontext.getAssignmentObj().getScreenshot("AssignemntGrade");
	}
	
	//date field check
	@When("User Enter any date available on calender  -AssignmentPage")
	public void user_enter_any_date_available_on_calender_assignment_page() throws InterruptedException {
		testcontext.getAssignmentObj().clickCalenderBtn();
		Thread.sleep(2000);
		testcontext.getAssignmentObj().clickDateBtn();
	}

	@Then("User should see the date entered -AssignmentPage")
	public void user_should_see_the_date_entered_assignment_page() {
		testcontext.getAssignmentObj().getScreenshot("AssignemntDate");
	}
	
	//save feature
	@When("User enters all details and clicks on Save -AssignmentPage")
	public void user_enters_all_details_and_clicks_on_save_assignment_page() {
		testcontext.getAssignmentObj().enterAssignName("sampleName");
		testcontext.getAssignmentObj().enterAssignDescri("sampleDescription");
		testcontext.getAssignmentObj().enterAssignGrd("A");
		testcontext.getAssignmentObj().clickCalenderBtn();
		testcontext.getAssignmentObj().clickDateBtn();
		testcontext.getAssignmentObj().clickAssignSave();
	}

	@Then("User should see {string} -AssignmentPage")
	public void user_should_see_assignment_page(String expAlert) {
		String actAlert = testcontext.getAssignmentObj().getAlertText();
		System.out.println("Expected:" + expAlert + "&  Actual:" + actAlert);
		Assert.assertEquals(actAlert, expAlert);
	}
	
	//cancel button check
	@When("User clicks on Cancel -AssignmentPage")
	public void user_clicks_on_cancel_assignment_page() {
		testcontext.getAssignmentObj().clickAssignCancel();
	}

	@Then("User should see Assignment Details form disappears -AssignmentPage")
	public void user_should_see_assignment_details_form_disappears_assignment_page() {
		boolean flag = testcontext.getAssignmentObj().isDisplayedAssigDet();
		System.out.println("Assignement Details form should be closed : " + flag);
		Assert.assertEquals(flag, false);
	}
}
