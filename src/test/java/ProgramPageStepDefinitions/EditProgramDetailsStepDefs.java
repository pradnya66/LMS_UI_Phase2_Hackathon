package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProgramDetailsStepDefs  extends BaseClass {

	 TestContext testcontext;
		
		public EditProgramDetailsStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	@Given("User on Program page")
	public void user_on_program_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		}
	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() throws Exception {
		Thread.sleep(3000);
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.programObj.clickonProgramCheckBox();
	}

	@Then("Program gets selected")
	public void program_gets_selected() {
		boolean flag = testcontext.programObj.checkIfProgramSelected();
		System.out.println("Flag = " +flag);
		Assert.assertTrue(flag, "Program is Selected");
	}
	
	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		testcontext.getProgramObj().clickonProgramEditBtn();
	}

	@Then("User lands on Program Details form {string}")
	public void user_lands_on_program_details_form(String ExpectedProgrmDetailHead) throws Exception {
		String ProgramDetHeading = testcontext.getProgramObj().checkProgDetHeading();
		System.out.println("ProgramDetHeading = " +ProgramDetHeading);
		Assert.assertEquals(ProgramDetHeading, ExpectedProgrmDetailHead, "Program Details Window Appeared");
	}
	
	@Given("User is on Program Details form")
	public void user_is_on_program_details_form() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickonProgramEditBtn();
	}

	@When("User edits Name {string}")
	public void user_edits_name(String programname) {
		testcontext.getProgramObj().editProgramName(programname);
	}

	@When("selects the Save button")
	public void selects_the_save_button() {
		testcontext.getProgramObj().clickonProgramSaveBtn();
	}
	
	@Then("User can see updated Name {string}")
	public void user_can_see_updated_name(String ExpeUpdProgName) {
		String ActUpdProgName  = testcontext.getProgramObj().getupdatedProgramName();
		Assert.assertEquals(ActUpdProgName, ExpeUpdProgName, "Program Name is Updated");
	}

	@When("User edits Description {string}")
	public void user_edits_description(String programdesc) {
		testcontext.getProgramObj().editProgramDescription(programdesc);
		testcontext.getProgramObj().clickonProgramSaveBtn();
	}

	@Then("User can see updated Description {string}")
	public void user_can_see_updated_description(String ExpeUpdProgDesc) {
		String ActUpdProgdes  = testcontext.getProgramObj().getupdatedProgramDesc();
		System.out.println("ActUpdProgdes ="  + ActUpdProgdes + "ExpeUpdProgDesc ="+ ExpeUpdProgDesc);
		Assert.assertEquals(ActUpdProgdes, ExpeUpdProgDesc, "Program Description is Updated");
	}

	@When("User changes status")
	public void user_changes_status() {
		testcontext.getProgramObj().editProgramStatustoInactive();
		testcontext.getProgramObj().clickonProgramSaveBtn();
	}

	@Then("User can see updated Status {string}")
	public void user_can_see_updated_status(String ExpeUpdProgStat) {
		String ActUpdProgstat  = testcontext.getProgramObj().getupdatedProgramStat();
		System.out.println("ActUpdProgstat ="  + ActUpdProgstat + "ExpeUpdProgStat ="+ ExpeUpdProgStat);
		Assert.assertEquals(ActUpdProgstat, ExpeUpdProgStat, "Program Status is Updated");
	}

	@When("User clicks Cancel button")
	public void user_clicks_cancel_button() {
		testcontext.getProgramObj().clickonProgramCancelBtn();
	}

	@Then("User can see Program Details form disappears {string}")
	public void user_can_see_program_details_form_disappears(String ExpHeading) {
		String ProgPageHeading = testcontext.getProgramObj().getHeading();
		System.out.println("ProgPageHeading ="  + ProgPageHeading + "ExpHeading ="+ ExpHeading);
		Assert.assertEquals(ProgPageHeading, ExpHeading, "User is on Program Page");
		
	}

	@When("User clicks Save button with name {string}")
	public void user_clicks_save_button_with_name(String progNAme) {
		testcontext.getProgramObj().clickonProgramSaveBtn();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String expAlert) throws Exception {
		
		String actAlert = testcontext.getProgramObj().getMessageText();
		System.out.println("Expected:" + expAlert + "&  Actual:" + actAlert);
		Assert.assertEquals(actAlert, expAlert);
	}


}
