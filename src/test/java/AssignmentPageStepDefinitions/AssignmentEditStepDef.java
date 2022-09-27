package AssignmentPageStepDefinitions;

import base.TestContext;
import io.cucumber.java.en.When;

public class AssignmentEditStepDef {

	TestContext testcontext;
	public AssignmentEditStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	@When("User clicks on Edit button -AssignmentPage")
	public void user_clicks_on_edit_button_assignment_page() {
	    testcontext.getAssignmentObj().clickEdit();
	}
}
