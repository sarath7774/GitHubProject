package org.tst.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM extends ExcelWrite {
	
	public LoginPOM() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtUsername() {

		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	//business logic
	public void login(String username, String password) {
	
		sendText(getTxtUsername(), username);
		sendText(getTxtpassword(), password);
		ClickAction(getBtnlogin());
	}
	
//	public static void main(String[] args) {
//		ExcelWrite e = new ExcelWrite();
//		e.getDriver();
//		LoginPOM l = new LoginPOM();
//		l.login("Sarath7774", "Sarath7774");
//		
//		
//	}
}
	
	