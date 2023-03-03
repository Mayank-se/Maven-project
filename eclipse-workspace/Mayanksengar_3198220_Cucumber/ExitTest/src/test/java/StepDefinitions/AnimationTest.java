package StepDefinitions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import AppPages.AnimationPage;
import Appium.Base.Testing.Base_Runner;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import io.cucumber.java.en.*;

public class AnimationTest extends Base_Runner{
	private static final Logger logger = LogManager.getLogger(AnimationTest.class);
	@Given("Start the Appium service")
	public void start_the_appium_service() {
		logger.info("-------------------start the appium service------------------------");
//		Headless
		Base_Runner.StartService();
//		Non-headless
//		Base_Runner.Setup();
	}
@Test(priority=1)
	@Given("First click on Animation button")
	public void first_click_on_animation_button() throws InterruptedException {
	logger.info("-------------------clicking on the Animation button---------------------------");	
	
		TouchAction touch=new TouchAction(driver);
		MobileElement element=driver.findElement(AnimationPage.Animation_Btn);
		touch.tap(tapOptions().withElement(element(element))).release().perform();
		Thread.sleep(5);
 
	}
@Test(priority=2)
	@Then("Click on Hide-Show Animation button")
	public void click_on_hide_show_animation_button() {
	logger.info("-------------------clicking on the Hide-Show Animation button------------------------");	
		TouchAction touch=new TouchAction(driver);
		MobileElement element=driver.findElement(AnimationPage.Hideshow_btn);
		touch.tap(tapOptions().withElement(element(element))).release().perform();

	}
@Test(priority=3)
@Then("Check the Hide button Working")
public void check_the_hide_button_working() {
	logger.info("-------------------Check the Hide button functionality------------------------");	
	MobileElement Hide_btn=driver.findElement(AnimationPage.HideRadio_btn);
	Hide_btn.click();
	for(int i=0;i<=3;i++) {
	MobileElement Hide_Alltbtn=driver.findElement(AnimationPage.HideButtons_btn);
	Hide_Alltbtn.click();
	}
	
}
@Test(priority=5)
@Then("Check the Custom button Working")
public void check_the_custom_button_working() throws InterruptedException{
	logger.info("-------------------Check the Custom button functionality------------------------");
	MobileElement Custom_btn=driver.findElement(AnimationPage.CustomRadio_btn);
	Custom_btn.click();
	MobileElement Custom_Firstbtn=driver.findElement(AnimationPage.CustomFirst_btn);
	Custom_Firstbtn.click();
	Thread.sleep(4);
	MobileElement Custom_Secbtn=driver.findElement(AnimationPage.CustomSec_btn);
	Custom_Secbtn.click();
	Thread.sleep(4);
	MobileElement Show_btn=driver.findElement(AnimationPage.Show_btn);
	Show_btn.click();
	logger.info("-------------------Reset the Application------------------------");
	driver.resetApp();
	
}
@Test(priority=4)
@Then("Check the Show button Working")
public void check_the_show_button_working() throws InterruptedException{
	logger.info("-------------------Check the Show button functionality------------------------");
	MobileElement Show_btn=driver.findElement(AnimationPage.Show_btn);
	Show_btn.click();
	Thread.sleep(5);
	
}

	@Then("Stop the Appium service")
	public void stop_the_appium_service() {
		logger.info("-------------------End the appium service------------------------");
//		headless
		Base_Runner.StopService();
//		Non-headless
//		Base_Runner.stopAppium();
	    
	}
}
