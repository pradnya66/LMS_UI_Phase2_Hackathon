package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Action;

public class AssignmentPage {

	WebDriver driver;
	Action action = new Action();


	public AssignmentPage(WebDriver d) {
		this.driver = d;
	}

	private By AssignHeading = By.xpath("//div[@class='box']");
	private By AssignBottomText = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	private By AssignFooter = By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div");
	private By AssignSearchBox = By.xpath("//span[@class='p-input-icon-left']/input");
	private By AssignSearchList = By.xpath("//tbody/tr/td[2]");
	private By AssignEdit = By.xpath("//div[@class='action']/span[1]");
	private By AssignDelete = By.xpath("//div[@class='action']/span[2]");
	private By TopDelete = By.xpath("//thead //div[@role='checkbox']");
	private By AssignDialogBox = By.xpath("//p-dialog/div/div");
	private By deleteDialogbox = By.xpath(
			"//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-7 p-dialog p-confirm-dialog p-component ng-star-inserted']");
	private By deleteYes = By.xpath("//span[contains(text(),'Yes')]");
	private By deleteNo = By.xpath("//span[contains(text(),'No')]");
	private By alertMsg1 = By.xpath("//div[@role='alert']/div/div[1]");
	private By alertMsg2 = By.xpath("//div[@role='alert']/div/div[2]");
	private By checkBoxes = By.xpath("//tbody/tr/td[1]");
	private By AssignNames = By.xpath("//tbody/tr/td[2]");
	private By AssignDescriptions = By.xpath("//tbody/tr/td[3]");
	private By checksTrail = By.xpath("//tbody //div[@role='checkbox']");
	private By AssignNameSort = By.xpath("//p-sorticon[@field='assignmentName']");
	private By AssignDescriptionSort = By.xpath("//p-sorticon[@field='description']");
	private By NewAssignBtn = By.xpath("//span[text()='A New Assignment']");
	private By FormTitle = By.xpath("//div/span[@id='pr_id_5-label']");
	private By AssignSaveBtn = By.xpath("//span[text()='Save']");
	private By AssignCancelBtn = By.xpath("//span[text()='Cancel']");
	private By NameReqMsg = By.xpath("//div/small[text()='Name is required.']");
	private By AssignNameBox = By.xpath("//input[@id='assignment']");
	private By AssignDescrBox = By.xpath("//input[@id='assignmentDescription']");
	private By AssignGrdBox = By.xpath("//input[@id='assignmentGraderId']");
	private By AssignCalenderBtn = By.xpath("//span[@class='p-button-icon pi pi-calendar']");
	private By AssignDateBtn = By.xpath("//span[text()='15']");

	public String getHeading() {
		return action.getText(AssignHeading, driver);
	}

	public String getBottomText() {
		return action.getText(AssignBottomText, driver);
	}

	public String getFooter() {
		return action.getText(AssignFooter, driver);
	}

	public String getSearchBoxAttribute() {
		return action.getPlaceholderAttribute(AssignSearchBox, driver);
	}

	public void clickOnSearch() {
		action.click(AssignSearchBox, driver);
	}

	public void enterTextInSearch(String namePhrase) {
		action.type(AssignSearchBox, driver, namePhrase);
	}

	public List<WebElement> getSearchResults() {
		return action.findElements(AssignSearchList, driver);
	}

	public void clickEdit() {
		action.click(AssignEdit, driver);
	}

	public void clickDelete() {
		action.click(AssignDelete, driver);
	}

	public void clickTopDelete() {
		action.click(TopDelete, driver);
	}

	public void clickDeleteYes() {
		action.click(deleteYes, driver);
	}

	public void clickDeleteNo() {
		action.click(deleteNo, driver);
	}

	public void clickAssignNameSort() {
		action.click(AssignNameSort, driver);
	}

	public void clickAssignDescriptionSort() {
		action.click(AssignDescriptionSort, driver);
	}

	public void clickNewAssign() {
		action.click(NewAssignBtn, driver);
	}

	public void clickAssignSave() {
		action.click(AssignSaveBtn, driver);
	}

	public void clickAssignCancel() {
		action.click(AssignCancelBtn, driver);
	}

	public void clickCalenderBtn() {
		action.click(AssignCalenderBtn, driver);
	}

	public void clickDateBtn() {
		action.click(AssignDateBtn, driver);
	}

	public boolean isDisplayedDelConf() {
		boolean flag = true;
		List<WebElement> Li = action.findElements(deleteDialogbox, driver);
		if (Li.size() == 0)
			flag = false;
		return flag;
	}

	public boolean isDisplayedAssigDet() {
		boolean flag = true;
		List<WebElement> Li = action.findElements(AssignDialogBox, driver);
		if (Li.size() == 0)
			flag = false;
		return flag;
	}

	public String getAlertText() {
		String alertMsg = action.getText(alertMsg1, driver) + " " + action.getText(alertMsg2, driver);
		return alertMsg;
	}

	public String getNameReqMsg() {
		return action.getText(NameReqMsg, driver);
	}

	public void selectCheckboxes(int count) {
		List<WebElement> Li = action.findElements(checkBoxes, driver);
		for (int i = 0; i < count; i++) {
			action.click(Li.get(i), driver);
		}
	}

	public boolean IsCheckBoxesEnabled(int count) {
		boolean flag = false;
		List<WebElement> Li = action.findElements(checksTrail, driver);
		for (int i = 0; i < count; i++) {
			flag = action.isEnabled(Li.get(i), driver);
			System.out.println(i + "button is selected" + flag);
			if (flag == false)
				break;
		}
		return flag;
	}

	public List<String> getAssignmentNames() {
		List<WebElement> ListNameElements = action.findElements(AssignNames, driver);
		List<String> ListNames = new ArrayList<String>();
		for (WebElement ele : ListNameElements) {
			ListNames.add(ele.getText());
		}
		return ListNames;
	}

	public List<String> getAssignmentDescriptions() {
		List<WebElement> ListDescrElements = action.findElements(AssignDescriptions, driver);
		List<String> ListDescriptions = new ArrayList<String>();
		for (WebElement ele : ListDescrElements) {
			ListDescriptions.add(ele.getText());
		}
		return ListDescriptions;
	}

	public String getFormTitle() {
		String formTitle = action.getText(FormTitle, driver);
		return formTitle;
	}

	public void enterAssignName(String AssignName) {
		action.type( AssignNameBox, driver,AssignName);
	}

	public void enterAssignDescri(String AssignDescri) {
		action.type( AssignDescrBox, driver,AssignDescri);
	}

	public void enterAssignGrd(String AssignGrd) {
		action.type(AssignGrdBox, driver,AssignGrd);
	}

	public String getAssignNamebox() {
		return action.getText(AssignNameBox, driver);
	}
	
	public void getScreenshot(String filename) {
		action.screenShot(driver, filename);
	}
}
