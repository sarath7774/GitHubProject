package org.tst.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingConfirmPOM extends ExcelWrite{
	
	public BookingConfirmPOM() {
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(id="first_name")
	private WebElement Fname;
	
	@FindBy(id="last_name")
	private WebElement Lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccNumb;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	

	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumb() {
		return ccNumb;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getbooknow() {
		return booknow;
	}
	public void bookHotels(String Fname, String LName, String address, String ccNumber, String card, String month,
			String year, String ccv) {
		
		sendText(getFname(), Fname);
		sendText(getLname(), LName);
		sendText(getAddress(), address);
		sendText(getCcNumb(), ccNumber);
		sendText(getCcType(), card);
		sendText(getCcexpmonth(), month);
		sendText(getCcexpyear(), year);
		sendText(getCccvv(), ccv);
		ClickAction(getbooknow());		
		
	}
	
	
}
