package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import AppPages.OSPage;
import Appium.Base.Testing.Base_Runner;
import Utility.ExcelTest;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OsTesting extends Base_Runner{
	private static final Logger logger = LogManager.getLogger(OsTesting.class);
	@Test(priority=12)
@Given("click on OS buttton")
public void click_on_os_buttton() {
		logger.info("-------------------click on OS buttton------------------------");
	MobileElement OsButton=driver.findElement(OSPage.OS_Btn);
	OsButton.click();
}
@Test(priority=13)
@Then("click on the SMS Messaging button")
public void click_on_the_sms_messaging_button() {
	logger.info("-------------------click on the SMS Messaging button------------------------");
	MobileElement SMSMessaging=driver.findElement(OSPage.SMSMessaging_Btn);
	SMSMessaging.click();
}
@Test(priority=14)
@Then("Check the Text feild Functionality")
public void check_the_text_feild_functionality() throws IOException {
	logger.info("-------------------Check the Text feild Functionality------------------------");
	MobileElement Enablebtn=driver.findElement(OSPage.Enable_Btn);
	Enablebtn.click();
	MobileElement recipient_txt=driver.findElement(OSPage.sms_recipient);
	recipient_txt.sendKeys(ExcelTest.SetupExcel().getRow(4).getCell(0).getStringCellValue());
	Assert.assertEquals(ExcelTest.SetupExcel().getRow(4).getCell(0).getStringCellValue(), "the action or process of receiving");
	MobileElement content_Txt=driver.findElement(OSPage.sms_content);
	content_Txt.sendKeys(ExcelTest.SetupExcel().getRow(5).getCell(0).getStringCellValue());
	Assert.assertEquals(ExcelTest.SetupExcel().getRow(5).getCell(0).getStringCellValue(), "the automation batch oct22");
	MobileElement send_message=driver.findElement(OSPage.send_messagebtn);
	send_message.click();
	logger.info("-------------------Reset the Application------------------------");
	driver.resetApp();
	
}
}
