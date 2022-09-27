package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Then;

public class FooterStepDefs  extends BaseClass{

	 TestContext testcontext;
		
		public FooterStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	
	
	@Then("User should see the text as {string} below the table")
	public void user_should_see_the_text_as_below_the_table(String expText) {
		String actText = testcontext.getProgramObj().getBottomText();
		System.out.println("Expected:"+expText+"&  Actual:"+actText);
		   Assert.assertEquals(actText, expText);
	}

	@Then("User should see the footer as {string}")
	public void user_should_see_the_footer_as(String expFooter) {
		String actFooter = testcontext.getProgramObj().getFooter();
		System.out.println("Expected:"+expFooter+"&  Actual:"+actFooter);
		   Assert.assertEquals(actFooter, expFooter);
	  
	}
}
