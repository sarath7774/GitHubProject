package org.tst.excel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iwatch 6");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().window().maximize();
		String Singlewindow = driver.getWindowHandle();
		Set<String> AllWidnows = driver.getWindowHandles();
		for (String x : AllWidnows) {
			if (!x.equals(Singlewindow)) {

				driver.switchTo().window(x);
			}

		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[3]")).click();
		//webdriverWait
//		WebDriverWait  w = new WebDriverWait(driver, 50);
//	//	w.until(Ex)
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("priceblock_ourprice")));
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("priceblock_ourprice")).getText());
		//System.out.println(driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price priceBlockBuyingPriceString']")).getText());

	}

}
