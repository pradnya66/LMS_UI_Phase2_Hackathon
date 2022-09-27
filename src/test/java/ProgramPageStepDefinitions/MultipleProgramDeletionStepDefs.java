package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleProgramDeletionStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public MultipleProgramDeletionStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	
	@When("User selects more than one Program using checkbox")
	public void user_selects_more_than_one_program_using_checkbox() throws InterruptedException {
		testcontext.getProgramObj().selectCheckboxes(2);
		Thread.sleep(2000);

	}

	@Then("Programs get selected")
	public void programs_get_selected() {
		boolean flag = testcontext.getProgramObj().IsCheckBoxesSelected(2);
        Assert.assertEquals(flag, true);

	}

	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		testcontext.getProgramObj().selectCheckboxes(2);
		testcontext.getProgramObj().clickonProgramPageDeleteBtn();
	
	}

//	@Given("User is on Confirm Deletion form")
//	public void user_is_on_confirm_deletion_form() {
//		
//
//	}
//
//	@Then("User can see Confirm Deletion form disappears")
//	public void user_can_see_confirm_deletion_form_disappears() {
//
//
//	}


}
