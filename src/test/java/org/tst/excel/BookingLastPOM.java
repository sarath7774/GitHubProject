package org.tst.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingLastPOM extends ExcelWrite {

	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public void bookingLast() throws InterruptedException {
		Thread.sleep(6000);
		String attribute2 = getOrderNo().getAttribute("value");
		System.out.println(attribute2);
	}


}
