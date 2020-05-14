package com.excelsheetoperations;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class GMReadExcel {

	public static String[][] getExcel() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Anki\\Desktop\\LoginDetails.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Credentials");
		int rows = sh.getRows();
		int cols = sh.getColumns();
		String[][] data = new String[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				data[i][j] = sh.getCell(j, i).getContents();
			}
		}
		return data;
	}
}
