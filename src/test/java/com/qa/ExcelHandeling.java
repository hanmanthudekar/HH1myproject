package com.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelHandeling {

	public static void main(String [] args) throws Exception  {

		FileInputStream file = new FileInputStream("C:\\AllSetups\\ExcelSelenium\\Excel1.xlsx");
		Sheet o = WorkbookFactory.create(file).getSheet("Sheet1");
		System.out.println(o.getRow(0).getCell(0));
		/*for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(o.getRow(i).getCell(j)+"\t");
			}
			System.out.println();
		}
	}*/}
}


