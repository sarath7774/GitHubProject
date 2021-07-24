package org.tst.excel;

public class AdacinPOMMain extends ExcelWrite{
	
	public static void main(String[] args) {
		ExcelWrite e  = new ExcelWrite();
				e.getDriver();
		LoginPOM l = new LoginPOM();
				l.login("Sarath7774","Sarath7774");
				
	}

}
