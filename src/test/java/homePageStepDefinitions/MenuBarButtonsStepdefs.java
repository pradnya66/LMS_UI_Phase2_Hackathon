package homePageStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class MenuBarButtonsStepdefs extends BaseClass{

	 TestContext testcontext;
		
		public MenuBarButtonsStepdefs(TestContext testcontext) {
			this.testcontext = testcontext;
			
		}
	
	@Then("User should see buttons on menu bar with proper texts")
	public void user_should_see_buttons_on_menu_bar_with_proper_texts(DataTable dataTable) {
		List<WebElement> Li =testcontext.homeObj.menubarBtnsTextList();
	
		 for (int i = 0; i < Li.size(); i++) {
		       Assert.assertEquals(Li.get(i).getText(), dataTable.row(0).get(i));
		    }
	
	}

}
