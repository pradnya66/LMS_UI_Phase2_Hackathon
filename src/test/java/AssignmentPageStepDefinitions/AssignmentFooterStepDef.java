package AssignmentPageStepDefinitions;

import org.testng.Assert;

import base.TestContext;
import io.cucumber.java.en.Then;

public class AssignmentFooterStepDef {

	TestContext testcontext;
	public AssignmentFooterStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	@Then("User should see the text as {string} below the table -AssignmentPage")
	public void user_should_see_the_text_as_below_the_table_assignment_page(String expText) {
		String actText = testcontext.getAssignmentObj().getBottomText();
		System.out.println("Expected:"+expText+"&  Actual:"+actText);
		   Assert.assertEquals(actText, expText);
	}

	@Then("User should see the footer as {string} -AssignmentPage")
	public void user_should_see_the_footer_as_assignment_page(String expFooter) {
		String actFooter = testcontext.getAssignmentObj().getFooter();
		System.out.println("Expected:"+expFooter+"&  Actual:"+actFooter);
		   Assert.assertEquals(actFooter, expFooter);
	}
}
