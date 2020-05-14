package DataProvider;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TC01_DataDriven {

	public static void main(String[] args) throws BiffException, IOException{
		File f = new File("C:/Users/Anki/Desktop/Input.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Login");
		int rows = s.getRows();
		int cols = s.getColumns();
		System.out.println(rows);
		System.out.println(cols);

	}
}
