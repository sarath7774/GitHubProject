package org.tst.excel;

import java.awt.Window;
import java.awt.event.WindowStateListener;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Apps\\Softwares\\Java\\New folder\\Practice_Time\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).click();;
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iwatch series 6");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	//driver.findElement(By.id("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	
	
	
	String handle = driver.getWindowHandle();
	System.out.println(handle);
	
	
	Set<String> Sllhandles = driver.getWindowHandles();
	System.out.println(Sllhandles);

	for (String x : Sllhandles) {
		if (!x.equals(handle)) {
			driver.switchTo().window(x);
			
			WebElement search = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price priceBlockBuyingPriceString']"));
			String attribute = search.getText();
			System.out.println(attribute);

		}
		
	}

	}
}
