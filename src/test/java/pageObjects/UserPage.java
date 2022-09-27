package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import actions.Action;

public class UserPage {

	WebDriver driver;
	Action action = new Action();
	
	
	private By UserButton = By.xpath("//button/span[text()='User']");
	private By UserPageHeading = By.xpath("//div[@class='box']");
	private By UserPageBottomText = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	private By  UserPageFooter = By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div");
	private By  UserPageDeleteicon = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	private By  UserSearchBox = By.xpath("//input[@Class = 'p-inputtext p-component']");
	private By UserLink = By.xpath("//span[@class='p-button-label ng-star-inserted']");
	private By UserDetails = By.xpath("//span[@class='p-dialog-title ng-tns-c132-313 ng-star-inserted']");
	
	private By UserCheckBox = By.xpath("//th/p-tableheadercheckbox/div/div[2]");
	private By UserEditBtn = By.xpath("(//button/span[@class='p-button-icon pi pi-pencil'])[1]");
	private By AddNewUserBtn = By.xpath("//span[@class='p-button-label'][contains(text(),'Add New User')]");
	
	
	private By UserID = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[2]");
	private By UserName = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[3]");
	private By UserEmail = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[4]");
	private By UserContact = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[5]");
	private By UserBatch = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[6]");
	private By UserSkill = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[7]");
		
	//WebElements on User Details Page
	private By UserFirstNameTextBox = By.xpath("//div/input[@id='mat-input-2']");
	private By UserMiddleNameTextBox = By.xpath("//div/input[@id='mat-input-3']");
	private By UserLastNameTextBox = By.xpath("//div/input[@id='mat-input-4']");
	private By EmailAddressTextBox = By.xpath("//div/input[@id='mat-input-5']");
	private By AddressTextBox = By.xpath("//div/input[@id='mat-input-6']");
	private By Address2TextBox = By.xpath("//div/textarea[@id='mat-input-61']");
	private By CityTextBox = By.xpath("//div/input[@id='mat-input-48']");
	private By StateTextBox = By.xpath("//*[@id='mat-select-value-1']/span");
	private By PostalCodeTextBox = By.xpath("//div/input[@id='mat-input-9']");
	private By ProgramTextBox = By.xpath("//div/input[@id='mat-input-10']");
	private By UGprogramTextBox = By.xpath("//div/input[@id='mat-input-11']");
	private By PGprogramTextBox = By.xpath("//input[@id='pgProgram']");
	private By SkillTextBox = By.xpath("//div/input[@id='mat-input-13']");
	private By ExperienceTextBox = By.xpath("//div/input[@id='mat-input-14']");
	private By UserRoleTextBox = By.xpath("//*[@id='mat-select-value-3']/span");
	private By VisaStatusTextBox = By.xpath("//div/input[@id='mat-input-15']");
	private By BatchTextBox = By.xpath("//div/input[@id='mat-input-16']");
	private By CommentsTextBox = By.xpath("//div/input[@id='mat-input-17']");
	private By UserNameTextBox = By.xpath("//div/input[@id='mat-input-18']");
	private By PasswordTextBox = By.xpath("//div/input[@id='mat-input-19']");
	private By FileTypeTextBox = By.xpath("//div/input[@id='mat-input-20']");
	private By UserCancelBtn = By.xpath("//button/span[contains(text(),'Cancel')]");
	private By UserSubmitBtn = By.xpath("//button/span[contains(text(),'Submit')]");
	private By UserCancel = By.xpath("//div/p-dialog[1]/div/div/div[1]/div/button]");
	private By ManageUsertext = By.xpath("//div[text()=' Manage User']");
	
	public String getManageUsertext() {
		return action.getText(ManageUsertext,driver);
	}
	
	public void clickOnUserBtn() {
		action.click(UserButton, driver);
	}
	
	public void clickOnAddNewUserBtn() {
		action.click(AddNewUserBtn, driver);
	}
	
	public boolean isDispalyedAddNewUser() {
		action.isDisplayed(AddNewUserBtn, driver);
		return false;
	}
		
	public String getHeading() {
		return action.getText(UserPageHeading,driver);
	}
	public boolean isDisplayedUserPageHeading() {
		 action.isDisplayed(UserPageHeading,driver);
		 return false;
	}
	public void clickonUserLink() {
		action.click(UserLink, driver);
	}
	public boolean isDisplayedUserDetail() {
		 action.isDisplayed(UserDetails, driver);
		 return false;
	}
	public String getBottomText() {
		return action.getText(UserPageBottomText,driver);
	}
	public boolean isDisplayedBottomText() {
		 action.isDisplayed(UserPageBottomText,driver);
		 return false;
	}
	
	public String getFooter() {
		return action.getText(UserPageFooter,driver);
	}
	public boolean isDisplayedPageFooter() {
		 action.isDisplayed(UserPageFooter,driver);
		 return false;
	}
	public String getSearchBoxText() {
		return action.getText(UserSearchBox , driver);
	}
	public boolean isDispalyedSearchBox() {
		action.isDisplayed(UserSearchBox, driver);
		return false;
	}
	
	public void clickonUserCheckBox() {
		action.click(UserCheckBox, driver);
		
	}
	public boolean isDispalyedUserCancel() {
		action.isDisplayed(UserCancel, driver);
		return false;
	}
	
	
	
	public void clickonUserEditBtn() {
		action.click(UserEditBtn, driver);
		
	}
	public boolean isDispalyedEditIcon() {
		action.isDisplayed(UserEditBtn, driver);
		return false;
	}
	public void clickonDelete() {
		action.click(UserPageDeleteicon, driver);
	}
	public boolean isDispalyedDeleteIcon() {
		action.isDisplayed(UserPageDeleteicon, driver);
		return false;
	}
	public void clickSkill() {
		action.click(UserSkill, driver);
	}
	
	public void clickonUserDetailSubmitBtn() {
		action.click(UserSubmitBtn, driver);
		
	}
	public boolean isDispalyedSubmitBtn() {
		action.isDisplayed(UserSubmitBtn, driver);
		return false;
	}
	
	public void clickonUserDetailCancelBtn() {
		action.click(UserCancelBtn, driver);
		
	}
	public boolean isDispalyedCancelBtn() {
		action.isDisplayed(UserCancelBtn, driver);
		return false;
	}
	
	
	public String editUserName(String programName) {
		action.clear(UserNameTextBox, driver);
		action.type(UserNameTextBox,driver, programName);
		return programName;
	}
	
		
	public String getSearchBoxAttribute() {
		return action.getPlaceholderAttribute(UserSearchBox, driver);
	}
	
	public void clickOnSearch() {
		action.click(UserSearchBox, driver);
	}
	
	public void enterTextInSearch(String namePhrase) {
		action.type(UserSearchBox, driver, namePhrase);
	}
	
	public void clickUserID() {
		action.click(UserID, driver);
	}
	public void clickUserName() {
		action.click(UserName, driver);
	}
	
	public void clickEmail() {
		action.click(UserEmail, driver);
	}
	
	public void clickContact() {
		action.click(UserContact, driver);
	}
	
	public void clickBatch() {
		action.click(UserBatch, driver);
	}
	public void sendkeysUserFirstNameTextBox() {
		action.sendkeys(UserFirstNameTextBox, driver);
	}
	public void sendkeysUserMiddleNameTextBox() {
		action.sendkeys(UserMiddleNameTextBox, driver);
	}
	public void sendkeysUserLastNameTextBox() {
		action.sendkeys(UserLastNameTextBox, driver);
	}
	public void sendkeysEmailAddressTextBox() {
		action.sendkeys(EmailAddressTextBox, driver);
	}
	public void sendkeysAddressTextBox() {
		action.sendkeys(AddressTextBox, driver);
	}
	public void sendkeysAddress2TextBox() {
		action.sendkeys(Address2TextBox, driver);
	}
	public void sendkeysCityTextBox() {
		action.sendkeys(CityTextBox, driver);
	}
	public void sendkeysStateTextBox() {
		action.sendkeys(StateTextBox, driver);
	}
	
	public void sendkeysPostalCodeTextBox() {
		action.sendkeys(PostalCodeTextBox, driver);
	}
	public void sendkeysProgramTextBox() {
		action.sendkeys(ProgramTextBox, driver);
	}
	public void sendkeysUGprogramTextBox() {
		action.sendkeys(UGprogramTextBox, driver);
	}
	public void sendkeysPGprogramTextBox() {
		action.sendkeys(PGprogramTextBox, driver);
	}
	public void sendkeysSkillTextBox() {
		action.sendkeys(SkillTextBox, driver);
	}
	public void sendkeysExperienceTextBox() {
		action.sendkeys(ExperienceTextBox, driver);
	}
	public void sendkeysUserRoleTextBox() {
		action.sendkeys(UserRoleTextBox, driver);
	}
	public void sendkeysVisaStatusTextBox() {
		action.sendkeys(VisaStatusTextBox, driver);
	}
	public void sendkeysBatchTextBox() {
		action.sendkeys(BatchTextBox, driver);
	}
	public void sendkeysCommentsTextBox() {
		action.sendkeys(CommentsTextBox, driver);
	}
	public void sendkeysPasswordTextBox() {
		action.sendkeys(PasswordTextBox, driver);
	}
	public void sendkeysFileTypeTextBox() {
		action.sendkeys(FileTypeTextBox, driver);
	}
	
	
	
}
