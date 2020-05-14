package TestNG_Practice;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Addition {

	@Test(dataProvider = "xyz")
	public void getAdd(String val1, String val2, String val3, String val4) {
		int num1 = Integer.parseInt(val1);
		int num2 = Integer.parseInt(val2);
		int num3 = Integer.parseInt(val3);
		int expected = Integer.parseInt(val4);

		Assert.assertEquals(num1 + num2 + num3, expected);
	}

	@DataProvider(name = "xyz")
	public Object[][] readExcelAdd() throws BiffException, IOException {

		File fis = new File("C:/Users/Anki/Desktop/Testdata/Input.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet(1);

		int rows = sh.getRows();
		int cols = sh.getColumns();
		// System.out.println(rows);
		// System.out.println(cols);

		String[][] Input = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				Cell c = sh.getCell(j, i);
				Input[i][j] = c.getContents();
				// System.out.println(Input[i][j]);
			}
		}
		return Input;
	}
}
