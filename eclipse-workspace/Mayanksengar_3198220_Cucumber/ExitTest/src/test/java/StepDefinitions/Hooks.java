package StepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

import Appium.Base.Testing.Base_Runner;




public class Hooks {
	private static final Logger logger = LogManager.getLogger(Hooks.class);
@BeforeSuite
public static void Start_The_Service() {

	logger.info("-------------------start the appium service------------------------");
	Base_Runner.StartService();
}

@AfterSuite
public static void End_The_Service() {
	logger.info("-------------------start the appium service and close extentreport------------------------");
	Base_Runner.extent.flush();
	Base_Runner.extent.close();
	Base_Runner.StopService();	
}
}
