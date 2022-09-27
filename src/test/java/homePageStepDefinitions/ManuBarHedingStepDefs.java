package homePageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Then;

public class ManuBarHedingStepDefs extends BaseClass{

	 TestContext testcontext;
		
		public ManuBarHedingStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
			
		}
	
	@Then("User should see a heading with text {string} on the Home page")
	public void user_should_see_a_heading_with_text_on_the_home_page(String HeadingExp) throws Exception {
		 String HeadingAct = testcontext.getHomeObj().getMenuBarHeading();
		  System.out.println("Actal Menu bar Heading =" +HeadingAct);
		  System.out.println("Expected Menu bar heading =" +HeadingExp);
		  Assert.assertEquals(HeadingAct, HeadingExp);
		  System.out.println("After MenuBar Then");
	}
}
