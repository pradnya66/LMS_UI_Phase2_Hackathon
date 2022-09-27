package ProgramPageStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProgramStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public SearchProgramStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
		
	@Given("User is logged on to LMS website -ProgramPage")
	public void user_is_logged_on_to_lms_website_program_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
	
	}

	@When("User is on Manage Program page -ProgramPage")
	public void user_is_on_manage_program_page_program_page() {
		testcontext.getProgramObj().clickOnProgrmBtn();
	   
	}

	@Then("User should see the text as {string} in the search box -ProgramPage")
	public void user_should_see_the_text_as_in_the_search_box_program_page(String expSearchText) {
		String actSearchText = testcontext.getProgramObj().getSearchBoxAttribute();
		System.out.println("Expected:" + expSearchText + "&  Actual:" + actSearchText);
		Assert.assertEquals(actSearchText, expSearchText);
	   
	}

	@When("User clicks on search box and enters {string}")
	public void user_clicks_on_search_box_and_enters(String namePhrase) throws Exception   {
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickOnSearch();
		testcontext.getProgramObj().enterTextInSearch(namePhrase);
		Thread.sleep(3000);
		
	   
	}

	@Then("User should see the Entries for the {string} -ProgramPage")
	public void user_should_see_the_entries_for_the_program_page(String namePhrase) {
		List<WebElement> resultsList = testcontext.getProgramObj().getSearchProgramNameResults();
		System.out.println("number of results we got with phrase:"+ resultsList.size());
		if (resultsList.size() !=0 ) {
			for (WebElement result : resultsList) {
				boolean flag = result.getText().contains(namePhrase);
				System.out.println("given search:" + namePhrase + " &  results:" + result.getText());
				Assert.assertEquals(flag, true);
			}
		} else {
			System.out.println("No results with the given phrase");
			Assert.assertEquals(testcontext.getProgramObj().getBottomText(), "Showing 0 to 0 of 0 entries");
		}
	}
	   
	@When("User clicks on search box and enters the {string}")
	public void user_clicks_on_search_box_and_enters_the(String DescPhrase) throws Exception   {
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickOnSearch();
		testcontext.getProgramObj().enterTextInSearch(DescPhrase);
		Thread.sleep(3000);
		
	   
	}

	@Then("User should see the Entries for {string} -ProgramPage")
	public void user_should_see_the_entries_for_program_page(String DescPhrase) {
		List<WebElement> resultsList = testcontext.getProgramObj().getSearchProgramDescResults();
		System.out.println("number of results we got with phrase:"+ resultsList.size());
		if (resultsList.size() !=0 ) {
			for (WebElement result : resultsList) {
				boolean flag = result.getText().contains(DescPhrase);
				System.out.println("given search:" + DescPhrase + " &  results:" + result.getText());
				Assert.assertEquals(flag, true);
			}
		} else {
			System.out.println("No results with the given phrase");
			Assert.assertEquals(testcontext.getProgramObj().getBottomText(), "Showing 0 to 0 of 0 entries");
		}
	   
	}
	
	@When("User clicks on search box and enters with {string}")
	public void user_clicks_on_search_box_and_enters_with (String StatPhrase) throws Exception   {
		testcontext.getProgramObj().clickOnProgrmBtn();
		testcontext.getProgramObj().clickOnSearch();
		testcontext.getProgramObj().enterTextInSearch(StatPhrase);
		Thread.sleep(3000);
		
	   
	}
	@Then("User should see the Entries with {string} -ProgramPage")
	public void user_should_see_the_entries_for_statusPhrase_program_page(String statPhrase) {
		List<WebElement> resultsList = testcontext.getProgramObj().getSearchProgramStatResults();
		System.out.println("number of results we got with phrase:"+ resultsList.size());
		if (resultsList.size() !=0 ) {
			for (WebElement result : resultsList) {
				boolean flag;
				if(result.getText()== statPhrase) {
				 flag = true;
				} 
				else {
				flag = false;
				}
				System.out.println("Flag =" + flag);						
				System.out.println("given search:" + statPhrase + " &  results:" + result.getText());
				Assert.assertEquals(flag, true);
			}
		} else {
			System.out.println("No results with the given phrase");
			Assert.assertEquals(testcontext.getProgramObj().getBottomText(), "Showing 0 to 0 of 0 entries");
		}
	   
	}
}
