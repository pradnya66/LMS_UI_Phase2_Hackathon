package AssignmentPageStepDefinitions;

import org.testng.Assert;

import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentMultiDeleteStepDef {
	
	TestContext testcontext;

	public AssignmentMultiDeleteStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@When("User selects two rows of assignments -AssignmentPage")
	public void user_selects_two_rows_of_assignments_assignment_page() {
		testcontext.getAssignmentObj().selectCheckboxes(2);

	}

	@Then("User should see that two rows got selected -AssignmentPage")
	public void user_should_see_that_two_rows_got_selected_assignment_page() throws InterruptedException {
		boolean flag = testcontext.getAssignmentObj().IsCheckBoxesEnabled(2);
          Assert.assertEquals(flag, true);
	}
	
	
}
