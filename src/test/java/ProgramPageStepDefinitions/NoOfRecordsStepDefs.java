package ProgramPageStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Then;

public class NoOfRecordsStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public NoOfRecordsStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(int ExpectedNoOfRecords) {
		List<WebElement> Li = testcontext.getProgramObj().getNoOfRecords();
		int ActualNoOfRecords = Li.size();
		System.out.println("ActualNoOfRecords = " + ActualNoOfRecords);
		Assert.assertEquals(ActualNoOfRecords,ExpectedNoOfRecords);
		
	}

}
