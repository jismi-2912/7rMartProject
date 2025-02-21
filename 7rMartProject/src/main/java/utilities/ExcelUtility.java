package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f; //to read the file
	static XSSFWorkbook wb; // to get data from the workbook
	static XSSFSheet   sh;  // to get the data from the particular sheet
	
	public static String getStringData(int a, int b) throws IOException {
		
		f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Obsqura Traning Notes\\Excels\\example.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(a);
		XSSFCell cell=row.getCell(b);
		
		return cell.getStringCellValue();
		
		
		
	}
	public static String getIntegerData(int a, int b) throws IOException {
		f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Obsqura Traning Notes\\Excels\\example.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(a);
		XSSFCell cell=row.getCell(b);
		
		int val=(int) cell.getNumericCellValue();
		return String.valueOf(val);//type conversion
	}
	public static String getFloatData(int a, int b) throws IOException {
		f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Obsqura Traning Notes\\Excels\\example.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(a);
		XSSFCell cell=row.getCell(b);
		
		float val=(float)cell.getNumericCellValue();
		return String.valueOf(val);
	}


}
