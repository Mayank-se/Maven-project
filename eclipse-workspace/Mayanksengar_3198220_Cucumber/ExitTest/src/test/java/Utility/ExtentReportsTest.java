package Utility;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportsTest {
	public static ExtentReports extent;
	 public static ExtentReports getInstance(String FileName) {
		 if(extent==null) {
				extent =new ExtentReports(FileName,true,DisplayOrder.NEWEST_FIRST);
		 }
		return extent;
	 }
}
