package UserDetailsStepDefinitions;



import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InputFieldsStepDef extends BaseClass {
    TestContext testcontext;
    public InputFieldsStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
	
	   
	@Given("User is on Manage user page after login")
	public void User_is_on_Manage_user_page_after_login() {
		 testcontext.getDriver().get(prop.getProperty("baseUrl"));
	}
	@When("User clicks Add new user button")
	public void User_clicks_Add_new_user_button() {
	    testcontext.getUserObj().clickOnAddNewUserBtn();
	}

	@Then("User should send the input to fields for First name Middle name Last name Email adress Phone no Address City State Postal Code Program UG Program PG Program Skill Experience User Role Visa status Batch Comments corresponding to their labels")
	public void User_should_send_input_to_fields_for_First_name_Middle_name_Last_name_Email_adress_Phone_no_Address_City_State_Postal_Code_Program_UG_Program_PG_Program_Skill_Experience_User_Role_Visa_status_Batch_Comments_corresponding_to_their_labels() {
	    testcontext.getUserObj().sendkeysAddress2TextBox();
	    testcontext.getUserObj().sendkeysAddressTextBox();
	    testcontext.getUserObj().sendkeysBatchTextBox();
	    testcontext.getUserObj().sendkeysCityTextBox();
	    testcontext.getUserObj().sendkeysCommentsTextBox();
	    testcontext.getUserObj().sendkeysEmailAddressTextBox();
	    testcontext.getUserObj().sendkeysExperienceTextBox();
	    testcontext.getUserObj().sendkeysFileTypeTextBox();
	    testcontext.getUserObj().sendkeysPasswordTextBox();
	    testcontext.getUserObj().sendkeysPGprogramTextBox();
	    testcontext.getUserObj().sendkeysPostalCodeTextBox();
	    testcontext.getUserObj().sendkeysProgramTextBox();
	    testcontext.getUserObj().sendkeysSkillTextBox();
	    testcontext.getUserObj().sendkeysStateTextBox();
	    testcontext.getUserObj().sendkeysUGprogramTextBox();
	    testcontext.getUserObj().sendkeysUserFirstNameTextBox();
	    testcontext.getUserObj().sendkeysUserLastNameTextBox();
	    testcontext.getUserObj().sendkeysUserMiddleNameTextBox();
	    testcontext.getUserObj().sendkeysUserRoleTextBox();
	    testcontext.getUserObj().sendkeysVisaStatusTextBox();
	    
	}
	
}
