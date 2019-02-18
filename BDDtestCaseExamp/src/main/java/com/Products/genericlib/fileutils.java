package com.Products.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileutils {
	String filepath = "C:\\Users\\sriharsha\\eclipse-workspace\\BDDtestCaseExamp\\data\\commondata.properties";
	String excelpath = "./data/worktable.xlsx";

	public Properties getproperty() throws Throwable {
		FileInputStream fis = new FileInputStream(filepath);
		Properties Pobj = new Properties();
		Pobj.load(fis);
		return Pobj;
	}
	public String getExcelData(String SheetName, int RowNum, int CelNum) throws Throwable {
	FileInputStream fis=new FileInputStream (excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(SheetName);
	String data=sh.getRow(RowNum).getCell(CelNum).getStringCellValue();
	wb.close();
	return data;
  }

}
	


