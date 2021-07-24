package org.tst.excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	Thread.sleep(3000);
		
		//simpleAlert
		//driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]")).click();
		//confirmAlertBox
		//driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
//		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[2]")).click();
//		//
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]")).click();
		Thread.sleep(3000);
		
		 Alert al = driver.switchTo().alert();
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_CONTROL);
		al.sendKeys("sarath");		
//		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
////	onclick="return fLogon();"
//		driver.findElement(By.xpath("//a[@ondblclick='return fLogon()']")).click();
	}
}
