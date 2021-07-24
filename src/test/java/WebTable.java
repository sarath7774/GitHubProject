import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"D:\\Apps\\Softwares\\Java\\New folder\\Practice_Time\\driver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	}

}
