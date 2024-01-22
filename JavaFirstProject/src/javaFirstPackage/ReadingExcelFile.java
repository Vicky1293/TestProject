package javaFirstPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		//specify the location of excel file
		File src = new File("S:\\vikram credence\\2.ETL TESTING\\EXCEL FILES\\test scenarios.xlsx");
		
		//load file
		FileInputStream fis = new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load worksheet
		XSSFSheet sh = wb.getSheet("Sheet4");
		
		//print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		//print something from excel sheet
		
		System.out.println(sh.getRow(5).getCell(5).getStringCellValue());
		System.out.println(sh.getRow(11).getCell(5).getStringCellValue());
		
		//print float/double value from excel sheet
		System.out.println(sh.getRow(5).getCell(10).getNumericCellValue());
		
		//print integer value from excel sheet
		System.out.println((int) sh.getRow(5).getCell(10).getNumericCellValue());
		
		//total number of rows
		System.out.println(sh.getPhysicalNumberOfRows());
		
		//total number of cell
		System.out.println(sh.getRow(5).getLastCellNum());
	}

}
