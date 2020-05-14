package com.excelsheetoperations;

import java.io.FileInputStream;

import jxl.Workbook;

public class GMGetExcel {

	public String getSheet(String path) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\Anki\\Desktop\\LoginDetails.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		String ss = new String();
		return path;

	}
}
