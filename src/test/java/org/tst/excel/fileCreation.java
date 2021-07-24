package org.tst.excel;

import java.io.File;
import java.io.IOException;

public class fileCreation {
	public static void main(String[] args) throws IOException {
		
		
	File f = new File("D:\\Apps\\Softwares\\Java\\New folder\\SampleMavenPractice\\ExcelRead\\sarath.txt");
	System.out.println("s");
	boolean createNewFile = f.createNewFile();
	System.out.println(createNewFile);
	}

}
