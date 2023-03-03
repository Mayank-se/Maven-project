package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import AppPages.GraphicPage;
import Appium.Base.Testing.Base_Runner;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GraphicTest extends Base_Runner {
	private static final Logger logger = LogManager.getLogger(GraphicTest.class);
	@Test(priority=15)
	@Given("click on Graphic buttton")
	public void click_on_graphic_buttton() {
		logger.info("-------------------click on Graphic buttton------------------------");
		MobileElement Graphicbtn=driver.findElement(GraphicPage.Graphic_Btn);
		Graphicbtn.click();
	}
	@Test(priority=16)
	@Then("click on AnimateDrawable button then go back")
	public void click_on_animate_drawable_button_then_go_back() {
		logger.info("-------------------click on AnimateDrawable button then go back------------------------");
		MobileElement AnimateDrawable=driver.findElement(GraphicPage.AnimateDrawable_Btn);
		AnimateDrawable.click();
		driver.navigate().back();
	}
	@Test(priority=17)
	@Then("click on Density button then go back")
	public void click_on_density_button_then_go_back() {
		logger.info("-------------------click on Density button then go back------------------------");
		MobileElement Densitybtn=driver.findElement(GraphicPage.Density_Btn);
		Densitybtn.click();
		driver.navigate().back();
	}
	@Test(priority=18)
	@Given("Scroll up in Grapic section")
	public void scroll_up_in_grapic_section() {
		logger.info("-------------------Scroll up in Grapic section------------------------");
		verticalswipeByPercentage(0.70,0.10,0.30);
		verticalswipeByPercentage(0.70,0.10,0.30);
		verticalswipeByPercentage(0.70,0.10,0.30);
		verticalswipeByPercentage(0.70,0.10,0.50);
		verticalswipeByPercentage(0.70,0.10,0.50);
		verticalswipeByPercentage(0.70,0.10,0.50);
	
	}
	@Test(priority=19)
	@Then("click on surfaceview overly")
	public void click_on_surfaceview_overly() {
		logger.info("-------------------click on surfaceview overly------------------------");
		MobileElement surfaceview=driver.findElement(GraphicPage.surfaceview_btn);
		surfaceview.click();
	
	}

}
