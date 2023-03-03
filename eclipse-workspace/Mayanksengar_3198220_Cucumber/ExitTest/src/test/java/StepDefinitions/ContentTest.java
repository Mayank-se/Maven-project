package StepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;



import AppPages.ContentPage;
import Appium.Base.Testing.Base_Runner;
import Utility.ExcelTest;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContentTest extends Base_Runner{
	private static final Logger logger = LogManager.getLogger(ContentTest.class);
	
	@Test(priority=6)
	@Given("first click on content and undo button")
	public void first_click_on_content_and_undo_button() {
		logger.info("-------------------first click on content and undo button------------------------");
		MobileElement content_btn=driver.findElement(ContentPage.Content_Btn);
		content_btn.click();
		MobileElement undo_btn=driver.findElement(ContentPage.Undo_btn);
		undo_btn.click();
		
	}
	@Test(priority=7)
	@Then("enter the Textview data")
	public void enter_the_textview_data() throws IOException {
		logger.info("-------------------enter the Textview data------------------------");
		MobileElement Textview_Text=driver.findElement(ContentPage.Textview_txt);
		Textview_Text.sendKeys(ExcelTest.SetupExcel().getRow(0).getCell(1).getStringCellValue());
		Assert.assertEquals(ExcelTest.SetupExcel().getRow(0).getCell(1).getStringCellValue(), "This is control Z text" );

	}
	@Test(priority=8)

	@Then("click on Textview button")
	public void click_on_textview_button() {
		logger.info("-------------------click on Textview button------------------------");
		MobileElement Append_btn=driver.findElement(ContentPage.Appends_btn);
		Append_btn.click();
		MobileElement Insert_btn=driver.findElement(ContentPage.Insertbtn);
		Insert_btn.click();
		MobileElement Sometxt_btn=driver.findElement(ContentPage.Sometext_btn);
		Sometxt_btn.click();

	}
	@Test(priority=9)
	@Then("Enter All textview field")
	public void enter_all_textview_field() throws IOException, InterruptedException {
		logger.info("-------------------Enter All textview field------------------------");
		MobileElement Textview_UndoText=driver.findElement(ContentPage.Textview_Text);
		Textview_UndoText.sendKeys(ExcelTest.SetupExcel().getRow(1).getCell(1).getStringCellValue());
		Assert.assertEquals(ExcelTest.SetupExcel().getRow(1).getCell(1).getStringCellValue(),"This is undo disabled text");
		String length= String.valueOf( ExcelTest.SetupExcel().getRow(2).getCell(1).getNumericCellValue());
		MobileElement Textview_lenght=driver.findElement(ContentPage.Textview_length);
		Textview_lenght.sendKeys(length);
		Assert.assertEquals(length,"12.0");
		MobileElement Textview_Card=driver.findElement(ContentPage.Textview_Cardno);
		Textview_Card.sendKeys(ExcelTest.SetupExcel().getRow(3).getCell(1).getStringCellValue());
		Assert.assertEquals(ExcelTest.SetupExcel().getRow(3).getCell(1).getStringCellValue(), "1234 3445 2345" );
		Thread.sleep(5);
		logger.info("-------------------Reset the Application------------------------");
		driver.resetApp();
		

	}
}
