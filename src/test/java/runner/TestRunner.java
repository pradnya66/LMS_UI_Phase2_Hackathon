//package runner;


//import io.cucumber.testng.AbstractTestNGCucumberTests;
////import org.testng.annotations.Test;
//import io.cucumber.testng.CucumberOptions;
//
////@Test
//@CucumberOptions(
//		features = "src/test/resources/features/ProgramPageFeatures", 
//		glue = {"ProgramPageStepDefinitions"},
//		//, "LogInPageStepDefinitions","homePageStepDefinitions","ProgramPageStepDefinitions"},
//		//tags = "@tag1",
//		//monochrome = true, dryRun = true,
//		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-html-reports/cucumber.json"})
//
//public class TestRunner extends AbstractTestNGCucumberTests
// {
//
//}
//		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" },	




package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;

//@Test
@CucumberOptions(
		features = "src/test/resources/features/AssignmentPageFeatures/AssignmentNew.feature", 
		glue = "AssignmentPageStepDefinitions", 
//		//"LogInPageStepDefinitions","homePageStepDefinitions","ProgramPageStepDefinitions"},
		tags = "@tag1",
//		//monochrome = true,
//		//dryRun = true,
		plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber-html-reports/cucumber.json"
				, "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
				 
//				   "json:target/cucumber-html-reports/cucumber.json",
//				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				   "html:target/cucumber.html"})

public class TestRunner extends AbstractTestNGCucumberTests
 {

}
////		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" },	
