	package org.tst.excel;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Date;
	import java.util.List;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptException;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	

	public class TestNGSample {
		
		WebDriver driver;
		
		@BeforeClass
		public void driver()
		{	WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
			
		}
		
		@BeforeMethod
		
		public void beforeMethod() {
			Date d = new Date();
			System.out.println("Start Time = "+d);

		}
		
		@Parameters({"username","password"})
		@Test
		public void login(String username, String password) {
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		}

		
		@Parameters({"location","hotels","room_type","room_nos","adult_room","child_room"})
		@Test()
		public void test1 (String location, String hotel, String rooms,
				String room_nos, //String fromDate,String toDate, 
				String Adult, String child) throws InterruptedException {
			
			WebElement dDnLocation = driver.findElement(By.id("location"));
			Select s = new Select(dDnLocation);
			s.selectByValue(location);
			//ee.sendText(dDnLocation, Location);

			WebElement dDnHotels = driver.findElement(By.id("hotels"));
			Select s1 = new Select(dDnHotels);
			s1.selectByValue(hotel);

			WebElement dDnRooms = driver.findElement(By.id("room_type"));
			Select s2 = new Select(dDnRooms);
			s2.selectByValue(rooms);

			WebElement dDnRoomsno = driver.findElement(By.id("room_nos"));
			Select s3 = new Select(dDnRoomsno);
			s3.selectByValue(room_nos);


			WebElement dDnAdults = driver.findElement(By.id("adult_room"));
			Select s4 = new Select(dDnAdults);
			s4.selectByValue(Adult);

			WebElement dDnChild = driver.findElement(By.id("child_room"));
			Select s5 = new Select(dDnChild);
			s5.selectByValue(child);
			Thread.sleep(5000);
			WebElement btnSearch = driver.findElement(By.id("Submit"));
			btnSearch.click();

		}
		@Test
		public void test2() throws InterruptedException {
			driver.findElement(By.id("radiobutton_0")).click();
			driver.findElement(By.id("continue")).click();
			Thread.sleep(5000);

		}
		
		@Parameters({"first_name","last_name","address","cc_num","cc_type","cc_exp_month",
			"cc_exp_year","cc_cvv"})
		@Test
		public void test3(String Fname, String LName, String address, String ccNumber, String card, String month,
				String year, String ccv) throws InterruptedException {

			System.out.println("A");
			 driver.findElement(By.id("first_name")).sendKeys(Fname);
			 driver.findElement(By.id("last_name")).sendKeys(LName);
			 driver.findElement(By.id("address")).sendKeys(address);
			 driver.findElement(By.id("cc_num")).sendKeys(ccNumber);
			 
			WebElement dDnCard = driver.findElement(By.id("cc_type"));
			Select s6 = new Select(dDnCard);
			s6.selectByValue(card);

			WebElement dDnMonth = driver.findElement(By.id("cc_exp_month"));
			Select s7 = new Select(dDnMonth);
			s7.selectByValue(month);
			WebElement dDnYear = driver.findElement(By.id("cc_exp_year"));
			Select s8 = new Select(dDnYear);
			s8.selectByValue(year);

			driver.findElement(By.id("cc_cvv")).sendKeys(ccv);

			driver.findElement(By.id("book_now")).click();

			Thread.sleep(3000);

		}
		@Test
		public void test4() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(4000);

			System.out.println(driver.findElement(By.id("order_no")).getAttribute("value"));

		}
		@AfterMethod
		
		public void afterMethod() {
			Date d = new Date();
			System.out.println("End Time = "+d);
		}
		
		@AfterClass
			public void afterClass() {
			//driver.quit();
			System.out.println("completed");
		}
}
