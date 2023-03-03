###EXIST TEST ASSIGNMENT README FILE

# Api Demo Automation Testing 


###All files description in the Maven Project

***file dir :-Inside this file dir "C:\Users\mayanksengar\eclipse-workspace\Mayanksengar_3198220_Cucumber\ExitTest\src\test\java"
four packages are define 


### Appium.Base.Testing contain two java file

***cucumber_Runner.java:- This is for running all stepdefinations file

***Base_Runner:- Inside this Appiun driver is setup



# To run Api Demo using cucumber Through (cucumber_Runner class) and also running with Testng Through(testng.xml file)

###StepDefinations contain six java file and Inside in src/main/java contain one pacakge "AppPages"

***AnimationTest.java and AnimationPage.java:- check the Animation functionallity

***ContentTest.java and ContentPage.java:- check the Content functionallity

***SimpletTransitionTest.java and SimpletTransitionPage.java:- check the SimpletTransition functionallity

***OsTesting.java and OSPage.java:- check the OS functionallity

***GraphicTest.java and GraphicPage.java:- check the graphic functionallity 

***Hooks.java:- Inside the hooks the define srating the Appium and Ending the Appium



###Features Files description generate by cucumber

***Animation.feature:- Contain all the step to run the Stepdefination

***Content.feature:- Contain all the step to run the Stepdefination

***SimpletTransition.feature:- Contain all the step to run the Stepdefination

***OS.feature:- Contain all the step to run the Stepdefination

***Graphic.feature:- Contain all the step to run the Stepdefination


###Utility pacakge contain 

***ExcelTest.java:- This file is used to pass get data from excel file and send to the Stepdefination file

***ExtentReportsTest.java:- This file is used to generate the extent report while running with Testng(file is generate in Report/TestngReport location 
and (I was use to extent report for testng and cucumber runner)) 

***ScreenShotTest.java: This file is used to generate the Failed screenshot.(Inside the FailedScreenshot folder)


###Config file description(All Test data passed externally by Config file and Excel File)

***Resources/Config.properties :- This properties file contain the Android capabilities(like app pacakge,app activity,android name,android version,app location) that 
is use for start the Apk. 

***ContentdatExcel File:- This file excel contain all the test data of the stepdefinations files.

***Inside src/test/resource path the log4j2.properties and extent.properties

****log4j2.properties:- this file is used to generate loggers.

****extent.properties:- this extent properties file is used to generate report while running with cucumber
(I was use to extent report for testng and cucumber runner)






## Packages Description

###This is for Appium driver
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

#For touch Action
import static io.appium.java_client.touch.offset.PointOption.point;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


###This is use for extentreport in TestNG
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

###This is use for extentreport in Cucumber
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter
