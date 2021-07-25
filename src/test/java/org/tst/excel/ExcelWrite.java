package org.tst.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWrite {
	String attribute;

	public static WebDriver driver;
	String data = "";


	public void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	public String sendText(WebElement e, String s) {
		e.sendKeys(s);
		//dfghjk
		//xcv
		//dfguio
		return s;
	}
	public String sendText2(WebElement e, String s) {
		e.sendKeys(s);
		return s;
	}
	public void ClickAction(WebElement e) {
		e.click();
	}
	
	public void selectAction(WebElement e,String s) {
		Select a = new Select(e);
		a.selectByValue(s);
	}
	public void selectAction1(WebElement e,String s) {
		Select a = new Select(e);
		a.selectByValue(s);
		//c
		//dfghjk
	}
	public void getAttr2(WebElement e) {
		 attribute = e.getAttribute("value");
		System.out.println(attribute);
	}
	
	public void getAttr(WebElement e) {
		 attribute = e.getAttribute("value");
		System.out.println(attribute);
	}

	
	public String readvalues(int rowid, int cellid) throws IOException {
		File file = new File("D:\\Apps\\Softwares\\Java\\New folder\\SampleMavenPractice\\ExcelRead\\demo.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("abc2");
		Row r = s.getRow(rowid);
		Cell c = r.getCell(cellid);
		int type = c.getCellType();
		
		if (type == 1) {
			data = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			 data = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
		} else {
			double numc = c.getNumericCellValue();
			long l = (long) numc;
			data = String.valueOf(l);
		}

		return data;
	}

}
