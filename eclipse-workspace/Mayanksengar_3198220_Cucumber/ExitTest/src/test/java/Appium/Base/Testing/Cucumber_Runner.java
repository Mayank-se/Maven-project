package Appium.Base.Testing;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features",
		glue="StepDefinitions",
		tags= "@tag_Graphic or @tag_Os or @tag_SimpleTransition or @tag_content or @tag_Animation",
		plugin={"pretty",
				"html:Reports/cucumber-reports/cucumberreport1.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false,
		monochrome=true
		)
public class Cucumber_Runner extends AbstractTestNGCucumberTests{
	
}
