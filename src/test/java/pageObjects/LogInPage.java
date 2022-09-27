package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import actions.Action;
import base.BaseClass;

public class LogInPage extends BaseClass {
    WebDriver driver;
    Action action = new Action();
    public LogInPage(WebDriver d) {
        this.driver = d;
    }

    private By loginbtn = By.xpath("//button/span[@class= 'mat-button-focus-overlay']");
    private By Username = By.xpath("//input[@id='username']");
    private By Password = By.xpath("//input[@id='password']");
    private By lmsHomePageTitle = By.xpath("//*[text()=' LMS - Learning Management System ']");
    private By logInErrorMessage = By.xpath("//mat-error[@role= 'alert']");

    public String getLoginPageTitle() {

        return action.getTitle(driver);
    }

    public void shouldShowInvalidPassword(String password) throws InterruptedException {
        action.type(Password, driver, password);
        System.out.println("invalid username or password");
    }
    public void shouldShowInvalidUsername(String username) throws InterruptedException {
        action.type(Username, driver, username);
        Thread.sleep(1000);
        System.out.println("invalid username or password");
    }
    public void shouldShowLMShomePageAfterLogin() throws Exception {
        action.type(Username, driver, prop.getProperty("userName"));
        action.type(Password, driver, prop.getProperty("password"));
        System.out.println("LMS HomePage after SignIn");
    }
    public String getTitleLoginPage() {
        return action.getText(logInErrorMessage, driver);
    }
    public String getTitleLMSHomePage() {
        return action.getText(lmsHomePageTitle, driver);
    }
    public String getInvalidLoginErrorMessage() {
        return action.getText(logInErrorMessage, driver);
    }
    public void clickonLogin() {
        action.click(loginbtn, driver);
    }
}
