package AssignmentPageStepDefinitions;

import java.util.Collections;
import java.util.List;

import org.testng.Assert;

import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentDescendStepDef {
	
	TestContext testcontext;
	public AssignmentDescendStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	private List<String> beforeNameList;
	private List<String> beforeDescripList;
	
	@When("User double clicks on AssignmentName sort button -AssignmentPage")
	public void user_double_clicks_on_assignment_name_sort_button_assignment_page() {
	    // Getting the list of string in the assignment names column
		  beforeNameList = testcontext.getAssignmentObj().getAssignmentNames();
	    // Sorting in descending way to compare the output results
	      Collections.sort(beforeNameList,String.CASE_INSENSITIVE_ORDER.reversed()); 
	    // double clicking to get order in descending order
          testcontext.getAssignmentObj().clickAssignNameSort();
          testcontext.getAssignmentObj().clickAssignNameSort();
	}

	@Then("User should see the results in Descending order of Assignment name -AssignmentPage")
	public void user_should_see_the_results_in_descending_order_of_assignment_name_assignment_page() {
		
		List<String> afterNameList = testcontext.getAssignmentObj().getAssignmentNames();
		boolean flag = false;
		for(int i=0;i<afterNameList.size();i++)
		{
			if(afterNameList.get(i).equals(beforeNameList.get(i)))
				flag=true;
			else {
				flag=false;
				break;
			}
		}
		Assert.assertEquals(flag, true);
	}
	
	// Description descending order 
	@When("User double clicks on AssignmentDescription sort button -AssignmentPage")
	public void user_double_clicks_on_assignment_description_sort_button_assignment_page()  {
		 // Getting the list of string in the assignment description column
		beforeDescripList =testcontext.getAssignmentObj().getAssignmentDescriptions();
		// Sorting in descending way to compare the output results
		Collections.sort(beforeDescripList,String.CASE_INSENSITIVE_ORDER.reversed());
		
		// double clicking to get order in descending order
		testcontext.getAssignmentObj().clickAssignDescriptionSort();
		testcontext.getAssignmentObj().clickAssignDescriptionSort();
	}

	@Then("User should see the results in Descending order of Assignment description -AssignmentPage")
	public void user_should_see_the_results_in_descending_order_of_assignment_description_assignment_page() {
		
		List<String> afterDescripList = testcontext.getAssignmentObj().getAssignmentDescriptions();
		boolean flag = false;
		for(int i=0;i<afterDescripList.size();i++)
		{
			if(afterDescripList.get(i).equals(beforeDescripList.get(i)))
			{	
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		Assert.assertEquals(flag, true);
	}
}
