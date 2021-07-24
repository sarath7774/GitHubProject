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

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinParent extends ExcelWrite {

	ExcelWrite ee;

	public void login(String UserName, String UserPass) {
		 ee = new ExcelWrite();
		// AdactinParent a1= new AdactinParent();
		WebElement txtUser = driver.findElement(By.id("username"));
		ee.sendText(txtUser, UserName);
		WebElement txtPass = driver.findElement(By.id("password"));
		// txtPass.sendKeys(UserPass);
		ee.sendText(txtPass, UserPass);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	public void SearchHotel(String Location, String hotel, String rooms, String room_nos, //String fromDate,String toDate, 
			String Adult, String child) throws InterruptedException {

		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select s = new Select(dDnLocation);
		s.selectByValue(Location);
		ee.sendText(dDnLocation, Location);

		WebElement dDnHotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(dDnHotels);
		s1.selectByValue(hotel);

		WebElement dDnRooms = driver.findElement(By.id("room_type"));
		Select s2 = new Select(dDnRooms);
		s2.selectByValue(rooms);

		WebElement dDnRoomsno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(dDnRoomsno);
		s3.selectByValue(room_nos);

//		driver.findElement(By.id("datepick_in")).clear();
//		driver.findElement(By.id("datepick_in")).sendKeys(fromDate);
//
//		driver.findElement(By.id("datepick_out")).clear();
//		driver.findElement(By.id("datepick_in")).sendKeys(toDate);

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

	public void SelectHotel() throws InterruptedException {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);

	}

	public void BookHotel(String Fname, String LName, String address, String ccNumber, String card, String month,
			String year, String ccv) throws InterruptedException {

		System.out.println("A");
		WebElement txtUser1 = driver.findElement(By.id("first_name"));
		// txtUser1.sendKeys(Fname);
		ee.sendText(txtUser1, Fname);
		System.out.println("b");
		WebElement txtUser2 = driver.findElement(By.id("last_name"));
		txtUser2.sendKeys(LName);
		ee.sendText(txtUser2, LName);

		WebElement txtAddress = driver.findElement(By.id("address"));
		// txtAddress.sendKeys(address);
		ee.sendText(txtAddress, address);

		WebElement txtCard = driver.findElement(By.id("cc_num"));
		// txtCard.sendKeys("1234567899876543");
		//txtCard.sendKeys();
		
		ee.sendText(txtCard, ccNumber);
		WebElement dDnCard = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(dDnCard);
		s6.selectByValue(card);

		WebElement dDnMonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(dDnMonth);
		s7.selectByValue(month);
		WebElement dDnYear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(dDnYear);
		s8.selectByValue(year);

		WebElement txtCVV = driver.findElement(By.id("cc_cvv"));
		// txtCVV.sendKeys(ccv);
		ee.sendText(txtCVV, ccNumber);

		driver.findElement(By.id("book_now")).click();

		Thread.sleep(3000);

	}

	public void BookingLast(int rowid,int cellid) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread.sleep(4000);

		System.out.println(driver.findElement(By.id("order_no")).getAttribute("value"));
		String data1 = driver.findElement(By.id("order_no")).getAttribute("value");

		File file = new File("D:\\Apps\\Softwares\\Java\\New folder\\SampleMavenPractice\\ExcelRead\\demo.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("abc2");
		Row r = s.getRow(rowid);
		Cell c = r.createCell(cellid);
		String orderid = c.getStringCellValue();

		if (orderid!=null) {
			c.setCellValue(data1);
			
			}
			FileOutputStream f1 = new FileOutputStream("D:\\Apps\\Softwares\\Java\\New folder\\SampleMavenPractice\\ExcelRead\\demo.xlsx");
			w.write(f1);
				}

		// driver.quit();

	
}
