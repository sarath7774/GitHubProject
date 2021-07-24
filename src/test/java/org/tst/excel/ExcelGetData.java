package org.tst.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelGetData {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Apps\\Softwares\\Java\\New folder\\GTTasks\\driver"//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		//List<WebElement> list = driver.findElements(By.id("countries"));
		WebElement findElement = driver.findElement(By.id("countries"));
		Select s1 = new Select(findElement);
		List<WebElement> options = s1.getOptions();
		
		driver.quit();
		File f = new File("D:\\Apps\\Softwares\\Java\\Learning SS\\demo\\data4.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement txt = options.get(i);
			String text = txt.getText();
			
			Row r = s.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(text);
		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		
	
		
		
		
	}
	
}
