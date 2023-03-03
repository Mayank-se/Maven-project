package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static XSSFSheet SetupExcel() throws IOException {
		  File file =    new File(".\\ExcelFile\\Contentdata.xlsx");
		  FileInputStream inputStream = new FileInputStream(file);
	      XSSFWorkbook wb=new XSSFWorkbook(inputStream);
	      XSSFSheet sheet=wb.getSheet("Sheet1");
	      return sheet;
	}

}
