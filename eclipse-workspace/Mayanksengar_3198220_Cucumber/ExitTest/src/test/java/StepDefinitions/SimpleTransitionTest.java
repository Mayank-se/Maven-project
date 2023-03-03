package StepDefinitions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import AppPages.AnimationPage;
import AppPages.SimpleTransitionPage;
import Appium.Base.Testing.Base_Runner;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;

public class SimpleTransitionTest extends Base_Runner {
	private static final Logger logger = LogManager.getLogger(SimpleTransitionTest.class);
	@Test(priority=10)
	@Then("check the scrollup functionality")
	public void check_the_scrollup_functionality() {
		logger.info("-------------------check the scrollup functionality------------------------");
		TouchAction touch=new TouchAction(driver);
		MobileElement element=driver.findElement(AnimationPage.Animation_Btn);
		touch.tap(tapOptions().withElement(element(element))).release().perform();
		 verticalswipeByPercentage(0.70,0.10,0.50);
	}
@Test(priority=11)
	@Then("click on Simple Transition button and check functionality")
	public void click_on_simple_transition_button_and_check_functionality() throws InterruptedException {
	logger.info("-------------------click on Simple Transition button and check functionality------------------------");
  
	MobileElement SimpleTransition=driver.findElement(SimpleTransitionPage.SimpleTransition_Btn);
	SimpleTransition.click();
	MobileElement SecRadio=driver.findElement(SimpleTransitionPage.SecRadio_Btn);
	SecRadio.click();
	MobileElement ThirdRadio=driver.findElement(SimpleTransitionPage.ThirdRadio_Btn);
	ThirdRadio.click();
	MobileElement FourRadio=driver.findElement(SimpleTransitionPage.FourRadio_Btn);
	FourRadio.click();
	MobileElement FirstRadio=driver.findElement(SimpleTransitionPage.FirstRadio_Btn);
	FirstRadio.click();
	Thread.sleep(5);
	logger.info("-------------------Reset the Application------------------------");
	driver.resetApp();
	}
}
