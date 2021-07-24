package org.tst.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPOM extends ExcelWrite{
	
	public SelectHotelPOM() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement contNext;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContNext() {
		return contNext;
	}
	
	public void selectHotel() throws InterruptedException {
		
		ClickAction(getRadiobtn());
		ClickAction(getContNext());
		
		Thread.sleep(5000);
	}
	

	
}
