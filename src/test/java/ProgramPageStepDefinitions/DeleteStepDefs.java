package ProgramPageStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Then;

public class DeleteStepDefs  extends BaseClass{

	 TestContext testcontext;
		
		public DeleteStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
		
		
		@Then("User should see the Delete button on the top left hand side as Disabled")
		public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
			boolean flag = testcontext.getProgramObj().DeleteBtnisDisabled();
			System.out.println("Flag = " +flag);
			Assert.assertFalse(flag, "Delete Button is Disablesd");
		}

}
