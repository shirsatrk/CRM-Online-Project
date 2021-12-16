package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excellRead {

	private FileInputStream fis;
	private Workbook wb;

	public ArrayList<String> readMultipleJxlExcell(String SheetName, String columnName) {
		ArrayList<String> data = new ArrayList<String>();
		try {
			fis = new FileInputStream("jxl.xls");
			wb = Workbook.getWorkbook(fis);
			Sheet sh = wb.getSheet(SheetName);
			
			int rows = sh.getRows();
			System.out.println(rows);
			int cols = sh.getColumns();
			System.out.println(cols);
			for (int i = 0; i < cols; i++) {
				if (sh.getCell(i, 0).getContents().equalsIgnoreCase(columnName)) {
					for (int j = 1; j < rows; j++) {
						String value = sh.getCell(i, j).getContents(); 
						System.out.println(value);
						data.add(value);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	public String readJxlExcell(String SheetName, String columnName, int rowNumber) {
		String data = null;
		try {
			fis = new FileInputStream("jxl.xls");
			wb = Workbook.getWorkbook(fis);
			Sheet sh = wb.getSheet(SheetName);
			int cols = sh.getColumns();

			for (int i = 0; i < cols; i++) {
				if (sh.getCell(i, 0).getContents().equalsIgnoreCase(columnName)) {

					data = sh.getCell(i, rowNumber).getContents();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	public List<String> readMultiplePoiExcell(String sheetName, String colName) {
		DataFormatter df = new DataFormatter();
		ArrayList<String> list = new ArrayList<String>();
		try {
			fis = new FileInputStream("poi.xlsx");
			org.apache.poi.ss.usermodel.Workbook wb = org.apache.poi.ss.usermodel.WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
			int row = sh.getLastRowNum();
			System.out.println(row);
			int col = 10;
			for (int i = 0; i < col; i++) {
				String data = df.formatCellValue(sh.getRow(0).getCell(i));
				
				if (data.equals(colName)) {
					for (int j = 1; j <= row; j++) {
						list.add(df.formatCellValue(sh.getRow(j).getCell(i)));

					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public String readPoiExcell(String sheetName, String colName, int rowNum) {
		DataFormatter df = new DataFormatter();
		
		String data = null;
		String value = null;
		try {
			fis = new FileInputStream("poi.xlsx");
			org.apache.poi.ss.usermodel.Workbook wb = org.apache.poi.ss.usermodel.WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
			//int row = sh.getLastRowNum();
			int col = 4;
			for (int i = 0; i < col; i++) {
				data = df.formatCellValue(sh.getRow(0).getCell(i)); 
				if (data.equals(colName)) {
					value = df.formatCellValue(sh.getRow(rowNum).getCell(i));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public String[][] readTabArrayExcell(String sheetName, int totCol) {
		DataFormatter df = new DataFormatter();
		String[][] TabArray = null;
		try {
			fis = new FileInputStream("poi.xlsx");
			org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
			int totRow = sh.getLastRowNum();
			System.out.println(totRow);
			int colStart = 1;
			int rowStart = 1;
			TabArray = new String[totRow][totCol];
			int rows = 0;
			
			for (int i = rowStart; i <= totRow; i++, rows++) {
				int cols = 0;
				for (int j = colStart; j <= totCol; j++, cols++) {
					TabArray[rows][cols] = df.formatCellValue(sh.getRow(i).getCell(j));
					System.out.println(TabArray[rows][cols]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return TabArray;

	}
	
}
