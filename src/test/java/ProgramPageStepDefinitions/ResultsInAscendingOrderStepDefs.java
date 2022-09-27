package ProgramPageStepDefinitions;

import java.util.Collections;
import java.util.List;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResultsInAscendingOrderStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public ResultsInAscendingOrderStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
			
		@When("User clicks on ProgramName sort button -ProgramPage")
		public void user_clicks_on_program_name_sort_button_program_page() {
			
			testcontext.getProgramObj().clickProgramNameSort();

		}

		@Then("User should see the results in Ascending order of Program name -ProgramPage")
		public void user_should_see_the_results_in_ascending_order_of_program_name_program_page() throws Exception {
			Thread.sleep(5000);
			List<String> afterNameList = testcontext.getProgramObj().getProgramNames();
			List<String> ExpNameList  = afterNameList;
			Collections.sort(ExpNameList,String.CASE_INSENSITIVE_ORDER);
			System.out.println("AfterNameList" +afterNameList);
			System.out.println("ExpNameList" +ExpNameList);
			
			
			boolean flag = false;
			for (int i = 0; i < afterNameList.size(); i++) {
				if (afterNameList.get(i).equals(ExpNameList.get(i)))
					flag = true;
				else {
					flag = false;
					break;
				}
			}
			Assert.assertEquals(flag, true);
		}

		

		@When("User clicks on ProgramDescription sort button -ProgramPage")
		public void user_clicks_on_program_description_sort_button_program_page() {
			testcontext.getProgramObj().clickProgramDescriptionSort();
			
		}

		@Then("User should see the results in Ascending order of Program description -ProgramPage")
		public void user_should_see_the_results_in_ascending_order_of_program_description_program_page() throws Exception {
			Thread.sleep(3000);
			List<String> afterDescripList = testcontext.getProgramObj().getProgramDescriptions();
			List<String> ExpDescList  = afterDescripList;
			Collections.sort(ExpDescList,String.CASE_INSENSITIVE_ORDER);
			System.out.println("AfterDescList" +afterDescripList);
			System.out.println("ExpDescList" +ExpDescList);
			
			boolean flag = false;
			for (int i = 0; i < afterDescripList.size(); i++) {
				if (afterDescripList.get(i).equals(ExpDescList.get(i))) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			Assert.assertEquals(flag, true);

		}

		@When("User clicks on ProgramStatus sort button -ProgramPage")
		public void user_clicks_on_program_status_sort_button_program_page() {
			
			testcontext.getProgramObj().clickProgramStatusSort();

		}

		@Then("User should see the results in Ascending order of Program Status -ProgramPage")
		public void user_should_see_the_results_in_ascending_order_of_program_status_program_page() throws Exception {
			Thread.sleep(3000);
			List<String> afterStatusList = testcontext.getProgramObj().getProgramStatus();
			List<String> ExpStatList  = afterStatusList;
			Collections.sort(ExpStatList,String.CASE_INSENSITIVE_ORDER);
			System.out.println("AfterStatList" +afterStatusList);
			System.out.println("ExpStatList" +ExpStatList);
			boolean flag = false;
			for (int i = 0; i < afterStatusList.size(); i++) {
				if (afterStatusList.get(i).equals(ExpStatList.get(i))) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			Assert.assertEquals(flag, true);
		}
	

}
