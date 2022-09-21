//package utility;
//
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//
//import actionsinterface.Action;
//import base.TestBase;
//import base.TestContext;
//import io.qameta.allure.Attachment;
//
//public class ListenerClass extends ExtentManager implements ITestListener {
//	
//TestContext testcontext;
//	
//	public ListenerClass(TestContext testcontext) {
//		this.testcontext = testcontext;
//		
//	}
//
//    Action action= new Action();
// // Text attachments for Allure
// 	@Attachment(value = "Page screenshot", type = "image/png")
// 	public byte[] saveScreenshotPNG(ThreadLocal<RemoteWebDriver> driver) {
// 		System.out.println("Attaching scrshot on allure report...............");
// 		return action.screenShotAllure(driver);
// 	}
//
// 	// Text attachments for Allure
// 	@Attachment(value = "{0}", type = "text/plain")
// 	public static String saveTextLog(String message) {
// 		return message;
// 	}
//    
//	public void onTestStart(ITestResult result) {
//		test = extent.createTest(result.getName());
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		if (result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, "Pass Test case is: " + result.getName());
//		}
//	}
//
//	public void onTestFailure(ITestResult result) {
//		if (result.getStatus() == ITestResult.FAILURE) {
//			saveScreenshotPNG(testcontext.getDriver());
//			saveTextLog(result.getName() + "failed and screenshot taken!");
//			try {
//				test.log(Status.FAIL,
//						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//				test.log(Status.FAIL,
//						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//				String imgPath = action.screenShot(testcontext.getDriver(), result.getName());
//			
//				test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void onTestSkipped(ITestResult result) {
//		if (result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
//		}
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//	}
//}