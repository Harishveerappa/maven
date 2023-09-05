package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
public static void write() throws Exception {
	File f= new File("C:\\Users\\hveer\\eclipse-workspace\\Maven_Project\\Excel_Sheet\\Book1.xlsx");
	FileInputStream fis =new FileInputStream(f);
	Workbook wa = new XSSFWorkbook(fis);
	Sheet createSheet =wa.createSheet("data");
	Row createRow = createSheet.createRow(0);
	Cell createCell=createRow.createCell(0);
	wa.getSheet("data").getRow(0).createCell(1).setCellValue("123");
	wa.getSheet("data").getRow(0).createCell(2).setCellValue("code");
	FileOutputStream fos = new FileOutputStream(f);
	wa.write(fos);
}
public static void main(String[] args) throws Exception {
	write();
}
}

