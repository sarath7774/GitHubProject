package org.tst.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPOM extends ExcelWrite{
	
	public SearchPOM() {
		PageFactory.initElements(driver, this);
	}
			
		@FindBy(id="location")
		private WebElement location;
		
		public WebElement getLocation() {
			return location;}
			
		@FindBy(id="hotels")
		private WebElement hotels;
		
		public WebElement gethotels() {
			return hotels;}
		
		@FindBy(id="room_type")
		private WebElement roomType;
		
		public WebElement getRoomType() {
			return roomType;
		}
		
		@FindBy(id="room_nos")
		private WebElement roomNos;
		
		public WebElement getRoomNos() {
			return roomNos;
		}
		
		@FindBy(id="adult_room")
		private WebElement adultRoom;
		
		public WebElement getadultRoom() {
			return adultRoom;
		}
		
		@FindBy(id="child_room")
		private WebElement childRoom;
		
		public WebElement getchildRoom() {
			return childRoom;
		}
		
		@FindBy(id="Submit")
		private WebElement btnSubmit;
		

		public WebElement getbtnSubmit() {
			return btnSubmit;
		}
		
		public void SearchHotels(String location,String hotels,String roomtype, String roomnos,String adultroom,String childRoom) throws InterruptedException {
			selectAction(getLocation(),location);
			
			selectAction(gethotels(),hotels);
			
			selectAction(getRoomType(),roomtype);
			
			selectAction(getRoomNos(),roomnos);
			
			selectAction(getadultRoom(),adultroom);
			
			selectAction(getchildRoom(),childRoom);
			Thread.sleep(5000);
			
			ClickAction(getbtnSubmit());
			
			
			
			
		}

}
