package Amazon;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoTest {

	public static void main(String[] args)throws IOException {
		FileInputStream fi=new FileInputStream("TextData.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet ws1=wb.getSheet("LoginData");
		Sheet ws2=wb.getSheet("EmpData");
		int sheet1_rowcount=ws1.getLastRowNum();
		int sheet2_rowcount=ws2.getLastRowNum();
		System.out.println(sheet1_rowcount);
		System.out.println(sheet2_rowcount);
		wb.close();
		fi.close();

	}

}	
