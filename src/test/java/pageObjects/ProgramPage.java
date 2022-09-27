package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Action;
import base.BaseClass;

public class ProgramPage extends BaseClass {
	WebDriver driver;
	Action action = new Action();

	public ProgramPage(WebDriver driver){
		this.driver = driver;
	}
	private By ProgramBtn = By.xpath("//button/span[text()='Program']");
	private By ProgramPageHeading = By.xpath("//div[@class='box']");
	private By ProgramPagrBottomText = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	private By  ProgramPagrFooter = By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div");
	private By  ProgramPageDelete = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	private By ProgramSearchBox = By.xpath("//input[@Class = 'p-inputtext p-component']");
	private By ProgramNameSearchList = By.xpath("//tbody/tr/td[2]");
	private By ProgramDescriptionSearchList = By.xpath("//tbody/tr/td[3]");
	private By ProgramStatusSearchList = By.xpath("//tbody/tr/td[4]");
	private By ProgramDelete = By.xpath("//div[@class='action']/span[2]");
	private By ManageProgramText = By.xpath("//div[text()=' Manage Program']");
	private By checkBoxes = By.xpath("//tbody/tr/td[1]");
	private By ProgramNameSort = By.xpath("//p-sorticon[@field='programName']");
	private By ProgramDescriptionSort = By.xpath("//p-sorticon[@field='description']");
	private By ProgramStatusSort = By.xpath("//p-sorticon[@field='status']");
	
	private By programpage1 = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span[2]/button[1]");
	private By programpreviouslink = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']//button[2]/span[@class='p-paginator-icon pi pi-angle-left']");
	private By prognextlink = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']//button[@class='p-paginator-next p-paginator-element p-link p-ripple']");
	private By programpage2 = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span[2]/button[2]");
	private By proglastpagelink = By.xpath("//button/span[@class='p-paginator-icon pi pi-angle-double-right']");
	
	
	
	private By ProgramCheckBox = By.xpath("(//div[@class='p-checkbox-box p-component'])[1]");
	private By ProgramEditBtn = By.xpath("(//button/span[@class='p-button-icon pi pi-pencil'])[1]");
	private By ANewProgramBtn = By.xpath("//button[@id='new']");
	
	private By ProgName = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[2]");
	private By ProgDes = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[3]");
	private By ProgStatus = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[4]");
	
	//WebElements on Program Details Page
	private By ProgramNameTextBox = By.xpath("//input[@id='programName']");
	private By ProgramDescriptionTextBox = By.xpath("//input[@id='programDescription']");
	private By ProgramStatusActiveBtn = By.xpath("(//span[@class='p-radiobutton-icon'])[1]");
	private By ProgramStatusInactiveBtn = By.xpath("(//span[@class='p-radiobutton-icon'])[2]");
	private By ProgramCancelBtn = By.xpath("//span[text()='Cancel']");
	private By ProgramSaveBtn = By.xpath("//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']");
	private By NameRequiredmsg = By.xpath("//div/small[text()='Name is required.']");
	private By ProgramDetailsHeading = By.xpath("//div/span[text()='Program Details']");
	private By ProgramNameText = By.xpath("//input[@id='programName']");
	
	//WebElements on Delete Confirm Dilogue Box
	private By deleteDialogboxConfirmText = By.xpath("//div/span[text()='Confirm']");
	private By deleteYes = By.xpath("//span[contains(text(),'Yes')]");
	private By deleteNo = By.xpath("//span[contains(text(),'No')]");
	
	//WebElements for messages after Save or Delete Program
	private By alertMsg1 = By.xpath("//div[@role='alert']/div/div[1]");
	private By alertMsg2 = By.xpath("//div[@role='alert']/div/div[2]");
	
//	private By alertMsg1 = By.xpath("//div[text()='Successful']");
//	private By alertMsg2 = By.xpath("//div[text()='Program Created']");
	
	
	
	
	public void clickOnProgrmBtn() {
		action.click(ProgramBtn, driver);
	}
	
	public void clickOnpageoneBtn() {
		action.click(programpage1, driver);
	}
	
	public void clickOnpagetwoBtn() {
		action.click(programpage2, driver);
	}
	
	public void clickOnANewProgrmBtn() {
		action.click(ANewProgramBtn, driver);
	}
	
	public boolean page1BtnisEnabled() {
		return action.isEnabled(programpage1, driver);
	}
	
	public boolean page2BtnisEnabled() {
		return action.isEnabled(programpage2, driver);
	}
	
	public void clickOnNextLink() {
		action.click(prognextlink, driver);
	}
	
	public void clickOnPreviousLink() {
		action.click(programpreviouslink, driver);
	}
	
	public void clickOnLastPageLink() {
		action.click(proglastpagelink, driver);
	}
	
	public String getHeading() {
		return action.getText(ProgramPageHeading,driver);
	}
	
	public String getBottomText() {
		return action.getText(ProgramPagrBottomText,driver);
	}
	
	public String getFooter() {
		return action.getText(ProgramPagrFooter,driver);
	}
	
	public String getSearchBoxText() {
		return action.getText( ProgramSearchBox , driver);
	}
	public void clickonProgramPageDeleteBtn() {
		action.click(ProgramPageDelete, driver);
	
	}
		
	public boolean DeleteBtnisDisabled() {
		return action.isEnabled(ProgramPageDelete, driver);
	}
	
	public boolean previousLinkisDisabled() {
		return action.isEnabled(programpreviouslink, driver);
	}
	
	public boolean nextLinkisDisabled() {
		return action.isEnabled(prognextlink, driver);
	}
	
	public List<WebElement> getNoOfRecords() {
		return action.findElements(ProgramNameSearchList, driver);
	}
	
	public List<WebElement> getNoOfRecordsforDescList() {
		return action.findElements(ProgramDescriptionSearchList, driver);
	}
	
	public void clickonProgramCheckBox() {
		action.click(ProgramCheckBox, driver);
		
	}
	
	public boolean checkIfProgramSelected() {
	boolean flag = action.isEnabled(ProgramCheckBox, driver);
	return flag;
	}
	
	public void clickonProgramEditBtn() {
		action.click(ProgramEditBtn, driver);
		
	}
	
	public String checkProgDetHeading() throws Exception {
		Thread.sleep(10000);
		String ProgramDetHead = action.getText(ProgramDetailsHeading, driver);
		return ProgramDetHead;
	}
	
	public void clickonProgramSaveBtn() {
		action.click(ProgramSaveBtn, driver);
		
	}
	
	public void clickonProgramCancelBtn() {
		action.click(ProgramCancelBtn, driver);
		
	}
	
	public String editProgramName(String programName) {
		action.clear(ProgramNameTextBox, driver);
		action.type(ProgramNameTextBox,driver, programName);
		return programName;
	}
	
	public String AddProgramName(String programName) {
		action.click(ProgramNameTextBox, driver);
		action.type(ProgramNameTextBox,driver, programName);
		return programName;
	}
	
	public String getupdatedProgramName() {
		String ActUpdatProgName = action.getText(ProgName, driver);
		return ActUpdatProgName; 
		
	}
	
	public String editProgramDescription(String programDesc) {
		action.clear(ProgramDescriptionTextBox, driver);
		action.type(ProgramDescriptionTextBox,driver, programDesc);
		return programDesc;
	}
	
	public String AddProgramDescription(String programDesc) {
		action.click(ProgramDescriptionTextBox, driver);
		action.type(ProgramDescriptionTextBox,driver, programDesc);
		return programDesc;
	}
	
	public String getupdatedProgramDesc() {
		String ActUpdatProgDesc = action.getText(ProgDes, driver);
		return ActUpdatProgDesc; 
	}
	
	public void editProgramStatustoInactive() {
		action.click(ProgramStatusInactiveBtn, driver);
	}
	
	public void editProgramStatustoActive() throws Exception {
		Thread.sleep(5000);
		action.click(ProgramStatusActiveBtn, driver);
	}
	
	public String getupdatedProgramStat() {
		String ActUpdatProgStat = action.getText(ProgStatus, driver);
		return ActUpdatProgStat; 
		
	}
	
	public String getNameReqMsg() {
		String ActNameReqMsg = action.getText(NameRequiredmsg, driver);
		return ActNameReqMsg; 
	}
	
	public String getProgNamefromNameTextBox() {
		String ActprogNameEnt = action.getText(ProgramNameText, driver);
		return ActprogNameEnt; 
		
	}
	
	public String getProgDescfromDescTextBox() {
		String ActprogDisEnt = action.getText(ProgramDescriptionTextBox, driver);
		return ActprogDisEnt; 
	}
	
	public boolean checkIfActiveStatBtnisSelected() {
		boolean flag = action.isSelected(ProgramStatusActiveBtn, driver);
		return flag;
		}
	
	public String getMessageText(){
		String alertMsg = action.getText(alertMsg1,driver) +" "+ action.getText(alertMsg2,driver);
		return alertMsg;
	}
		
	public String getSearchBoxAttribute() {
		return action.getPlaceholderAttribute(ProgramSearchBox, driver);
	}
	
	public void clickOnSearch() {
		action.click(ProgramSearchBox, driver);
	}
	
	public void enterTextInSearch(String namePhrase) {
		action.type(ProgramSearchBox, driver, namePhrase);
	}
	
	public List<WebElement> getSearchProgramNameResults(){
		return action.findElements(ProgramNameSearchList, driver);
	}
	
	public List<WebElement> getSearchProgramDescResults(){
		return action.findElements(ProgramDescriptionSearchList, driver);
	}
	
	public List<WebElement> getSearchProgramStatResults(){
		return action.findElements(ProgramStatusSearchList, driver);
	}
	
	public void clickDelete() {
		action.click(ProgramDelete, driver);
	}
	
	public String getDisplayedDelDilBoxConftext() {
		String DelConfirmText = action.getText(deleteDialogboxConfirmText, driver);
		return DelConfirmText;
	}
	
	public void clickDeleteYes() {
		action.click(deleteYes, driver);
	}
	
	public void clickDeleteNo() {
		action.click(deleteNo, driver);
	}
	
	public String getManageProgramText() {
		String ManProgText = action.getText(ManageProgramText, driver);
		return ManProgText;
	}
	
	public void selectCheckboxes(int count)
	{
		List<WebElement> Li = action.findElements(checkBoxes, driver);
		for(int i=0;i<count;i++)
		{
			action.click(Li.get(i), driver);
		}
	}
	
	public boolean IsCheckBoxesSelected(int count)
		{
			boolean flag = false;
			List<WebElement> Li = action.findElements(checkBoxes, driver);
			for(int i=0;i<count;i++)
			{
				flag = action.isEnabled(Li.get(i),driver);
				System.out.println(i+"button is selected"+flag);
				if(flag==false) break;
			}
			return flag;
		}
	
	public List<String> getProgramNames() {
		List<WebElement> ListNameElements = action.findElements(ProgramNameSearchList, driver);
		List<String> ListNames = new ArrayList<String>();
		for (WebElement ele : ListNameElements) {
			ListNames.add(ele.getText());
		}
		return ListNames;
	}

	public List<String> getProgramDescriptions() {
		List<WebElement> ListDescrElements = action.findElements(ProgramDescriptionSearchList, driver);
		List<String> ListDescriptions = new ArrayList<String>();
		for (WebElement ele : ListDescrElements) {
			ListDescriptions.add(ele.getText());
		}
		return ListDescriptions;
	}
	
	public List<String> getProgramStatus() {
		List<WebElement> ListStatusElements = action.findElements(ProgramStatusSearchList, driver);
		List<String> ListStatus = new ArrayList<String>();
		for (WebElement ele : ListStatusElements) {
			ListStatus.add(ele.getText());
		}
		return ListStatus;
	}
	
	public void clickProgramNameSort() {
		action.click(ProgramNameSort, driver);
	}

	public void clickProgramDescriptionSort() {
		action.click(ProgramDescriptionSort, driver);
	}
	
	public void clickProgramStatusSort() {
		action.click(ProgramStatusSort, driver);
	}
	
	public void getScreenshot(String filename) {
		action.screenShot(driver, filename);
	}

		
		
	}
	


