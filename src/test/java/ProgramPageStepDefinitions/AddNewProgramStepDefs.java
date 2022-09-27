package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewProgramStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public AddNewProgramStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	 
		
	 @When("User clicks <A New Program> button")
	 public void user_clicks_a_new_program_button() {
		 testcontext.getProgramObj().clickOnProgrmBtn();
		 testcontext.getProgramObj().clickOnANewProgrmBtn();
	}

	 @Then("User lands on Program Details form. {string}")
	 public void user_lands_on_program_details_form(String ExpectedProgrmDetailHead) throws Exception {
		String ProgramDetHeading = testcontext.getProgramObj().checkProgDetHeading();
		System.out.println("ProgramDetHeading = " +ProgramDetHeading);
		Assert.assertEquals(ProgramDetHeading, ExpectedProgrmDetailHead, "Program Details Window Appeared");
	    
	 }
	 
	 @Given("User on Program Details form")
		public void user_on_program_details_form() throws Exception {
			testcontext.getDriver().get(prop.getProperty("baseUrl"));
			testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
			testcontext.getLoginObj().clickonLogin();
			testcontext.getProgramObj().clickOnProgrmBtn();
			testcontext.getProgramObj().clickOnANewProgrmBtn();
		}

	 @When("User clicks <Save> button without entering data")
	 public void user_clicks_save_button_without_entering_data() {
		 testcontext.getProgramObj().clickonProgramSaveBtn();     
	    
	 }

	 @Then("User gets message {string}")
	 public void user_gets_message(String ExpNameReqMsg) throws Exception {
		Thread.sleep(5000);
		String ActNameReqMsg = testcontext.programObj.getNameReqMsg();
		System.out.println("ActNameReqMsg = " +ActNameReqMsg);
		Assert.assertEquals(ActNameReqMsg, ExpNameReqMsg, "Got Name Required Message");
	    
	 }

	 @When("User enters Name {string} in text box")
	 public void user_enters_name_in_text_box(String ProgramName) {
		 testcontext.getProgramObj().AddProgramName(ProgramName);
	    
	 }
	
	 @Then("User can see screenshot {string}")
	 public void user_can_see_screenshot(String filename) throws InterruptedException {
		 testcontext.getProgramObj().getScreenshot(filename);
	    
	 }

	 @When("User enters Description {string} in text box")
	 public void user_enters_description_in_text_box(String ProgramDes) {
		 testcontext.getProgramObj().AddProgramDescription(ProgramDes);
	 }

	 @Then("User see screenshot {string}")
	 public void user_see_screenshot(String filename) {
		 testcontext.getProgramObj().getScreenshot(filename);
	    
	 }

	 @When("User selects <Status> using radiobutton")
	 public void user_selects_status_using_radiobutton() throws Exception {
		 testcontext.getProgramObj().editProgramStatustoActive();
	    
	 }

	 @Then("User can see active status selected")
	 public void user_can_see_active_status_selected() {
	     
		boolean flag = testcontext.getProgramObj().checkIfActiveStatBtnisSelected();
		System.out.println("Flag =" + flag);
		Assert.assertTrue(flag, "Active Status Btn is Selected");
	 }

	 @When("User clicks <Save> button")
	 public void user_clicks_save_button() {
		 testcontext.getProgramObj().clickonProgramSaveBtn();
	 }
	 
//	 @When("User clicks <Cancel> button")
//	 public void user_clicks_cancel_button() {
//		 testcontext.getProgramObj().clickonProgramCancelBtn();
//	 }

//	 @Then("User can see Program Details form disappears {string}")
//	 public void user_can_see_program_details_form_disappears(String ExpHeading) {
//		 String ProgPageHeading = testcontext.getProgramObj().getHeading();
//		Assert.assertEquals(ProgPageHeading, ExpHeading, "User is on Program Page");
//	    
//	 }
	
		

}
