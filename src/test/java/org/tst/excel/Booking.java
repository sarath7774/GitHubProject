package org.tst.excel;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Booking extends ExcelWrite {

		@Parameters({"username","password","location","hotels","room_type","room_nos",
			"adult_room","child_room","first_name","last_name","address","cc_num",
			"cc_type","cc_exp_month",
			"cc_exp_year","cc_cvv"})
		@Test
		public void bookinginfo(String userName,String passWord,String location,String hotels,
				String roomtype, String roomnos, String adultroom, String childroom, String fname,
				String lname,String address,String ccnum,String cctype, String ccexpmonth, String ccexpyear
				,String cccvv) throws InterruptedException {
		getDriver();
		
		//login
		LoginPOM l = new LoginPOM();
		l.login(userName, passWord);
			
		SearchPOM searchHotels = new SearchPOM();
		searchHotels.SearchHotels(location,hotels,roomtype,roomnos,adultroom,
				childroom);
		
		SelectHotelPOM selectHotelPOM = new SelectHotelPOM(); 
		selectHotelPOM.selectHotel();
		
	    BookingConfirmPOM bookingConfirmPOM = new	BookingConfirmPOM();
	    bookingConfirmPOM.bookHotels(fname, lname, address,ccnum,
	    		cctype, ccexpmonth, ccexpyear, cccvv);
	    
	    BookingLastPOM bookingLastPOM = new BookingLastPOM();
	    bookingLastPOM.bookingLast();
		
	}
}


