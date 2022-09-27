package AssignmentPageStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentSearchStepDef {

	TestContext testcontext;

	public AssignmentSearchStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	private String NamePhrase = null;

	@Then("User should see the text as {string} in the search box -AssignmentPage")
	public void user_should_see_the_text_as_in_the_search_box_assignment_page(String expSearchText) {
		String actSearchText = testcontext.getAssignmentObj().getSearchBoxAttribute();
		System.out.println("Expected:" + expSearchText + "&  Actual:" + actSearchText);
		Assert.assertEquals(actSearchText, expSearchText);
	}

	@When("User clicks on search box and enters {string} -AssignmentPage")
	public void user_clicks_on_search_box_and_enters_assignment_page(String namePhrase) throws InterruptedException {
		NamePhrase = namePhrase;
		testcontext.getAssignmentObj().clickOnSearch();
		testcontext.getAssignmentObj().enterTextInSearch(namePhrase);
		Thread.sleep(1000);
	}

	@Then("User should see the Entries for the name phrase -AssignmentPage")
	public void user_should_see_the_entries_for_the_name_phrase_assignment_page() {
		List<WebElement> resultsList = testcontext.getAssignmentObj().getSearchResults();
		System.out.println("number of results we got with phrase:"+ resultsList.size());
		if (resultsList.size() !=0 ) {
			for (WebElement result : resultsList) {
				boolean flag = result.getText().contains(NamePhrase);
				System.out.println("given search:" + NamePhrase + " &  results:" + result.getText());
				Assert.assertEquals(flag, true);
			}
		} else {
			System.out.println("No results with the given phrase");
			Assert.assertEquals(testcontext.getAssignmentObj().getBottomText(), "Showing 0 to 0 of 0 entries");
		}
	}
}
