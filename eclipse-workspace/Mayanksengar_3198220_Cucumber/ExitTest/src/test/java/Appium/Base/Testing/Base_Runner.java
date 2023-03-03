package Appium.Base.Testing;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Utility.ExtentReportsTest;
import Utility.ScreenShotTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
public class Base_Runner {
	public static AppiumDriver<MobileElement> driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	private static DesiredCapabilities capabilties = new DesiredCapabilities();
	private static AppiumDriverLocalService service;
	public static Properties prop=new Properties();
	public static FileInputStream fis=null;
	static {
		try {
			File file=new File("./Resource/Config.properties");
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void StartService() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		extent=ExtentReportsTest.getInstance("./Reports/TestngReport/ExtentReport1.html");
		setAndroidCapabilities();
		
	}
    public static void Setup()
	{
		setAndroidCapabilities();
	}
    @BeforeMethod
    public static void extentStart(Method method) {
    	extentTest=extent.startTest(method.getName());
    }
    @AfterMethod
    public static void extentEnd(ITestResult result) {
    	if(result.getStatus()== ITestResult.FAILURE) {
    		String scrPath = ScreenShotTest.captureScreenshot(driver, result.getName());
    		extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(scrPath) );
    	}
    	else if(result.getStatus()== ITestResult.SUCCESS) {
    		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");
    	}
    	extent.endTest(extentTest);
    }
    public  void verticalswipeByPercentage(double startpercentage,double endpercentage,double anchorpercentage)
    {
    	 Dimension size= driver.manage().window().getSize();
    	 int anchor=(int)(size.width*anchorpercentage);
    	 int startpoint=(int)(size.width*startpercentage);
    	 int endpoint=(int)(size.width*endpercentage);
    	 new TouchAction(driver).press(point(anchor,startpoint)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,endpoint)).release().perform();
  }
	
    public static void  stopAppium(){
    	driver.quit();
    }
	public static void StopService() {
		service.stop();
	}
	public static  AppiumDriver<MobileElement> setAndroidCapabilities()  {
		capabilties.setCapability("appium-version", prop.getProperty("appium-version"));
		capabilties.setCapability("platformName", prop.getProperty("platformName"));
		capabilties.setCapability("platformVersion", prop.getProperty("platformVersion"));
		capabilties.setCapability("appPackage", prop.getProperty("appPackage"));
		capabilties.setCapability("appActivity", prop.getProperty("appActivity"));
		capabilties.setCapability("deviceName", prop.getProperty("deviceName"));
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilties);
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return driver;
	 }
}
