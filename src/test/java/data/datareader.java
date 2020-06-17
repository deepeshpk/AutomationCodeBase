package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pojo.TestCase;
import pojo.WebTable; 


public class datareader {
	
	
	public ArrayList<TestCase> readExecl() throws InvalidFormatException, IOException {
		
		ArrayList<TestCase> mydata = new ArrayList<TestCase>();
		TestCase  tcObject = null;
		
		File file1 = new File("Book2.xlsx");   //creating a new file instance  
		XSSFWorkbook wb = new XSSFWorkbook(file1);  
		XSSFSheet sheet = wb.getSheetAt(0); 
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println( row  + " " + col );
		
		
		for(int i=1; i<=row; i++ ) {
			
			XSSFRow rowObject = sheet.getRow(i);
			
			tcObject = new TestCase();
			
			tcObject.setTcID(rowObject.getCell(0).getStringCellValue());
			tcObject.setUserName(rowObject.getCell(1).getStringCellValue());
			tcObject.setPassword(rowObject.getCell(2).getStringCellValue());
			tcObject.setScenario(rowObject.getCell(3).getStringCellValue());
			System.out.println();
			
			mydata.add(tcObject);
			
		}
		return mydata;
	}
	
	
	public ArrayList<TestCase> readTC02() throws InvalidFormatException, IOException {
		
		ArrayList<TestCase> mydata = new ArrayList<TestCase>();
		TestCase  tcObject = null;
		
		File file1 = new File("Book2.xlsx");   //creating a new file instance  
		XSSFWorkbook wb = new XSSFWorkbook(file1);  
		XSSFSheet sheet = wb.getSheetAt(1); 
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println( row  + " " + col );
		
		
		for(int i=1; i<=row; i++ ) {
			
			XSSFRow rowObject = sheet.getRow(i);
			
			tcObject = new TestCase();
			
			tcObject.setTcID(rowObject.getCell(0).getStringCellValue());
			tcObject.setFname(rowObject.getCell(1).getStringCellValue());
			tcObject.setLname(rowObject.getCell(2).getStringCellValue());
			tcObject.setAge(rowObject.getCell(3).getStringCellValue());
			tcObject.setMail(rowObject.getCell(4).getStringCellValue());
			tcObject.setSalary(rowObject.getCell(5).getStringCellValue());
			System.out.println();
			
			
		}
		
		mydata.add(tcObject);
		return mydata;
	}

}
