package selenium001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsheethandling {
	public static void writeExcelSheet () throws IOException {
		//first create workbook
		XSSFWorkbook workbook1 = new XSSFWorkbook();
		
		//second step create sheet in workbook
		XSSFSheet sheet1 = workbook1.createSheet("sheet one");
		
		int rowNumber=0;
		for (int i=0;i<=20;i++) {
			//create rows in sheet
			Row row= sheet1.createRow(rowNumber++);
			int columnNumber=0;
			//create columns in sheet
			for(int j=0;j<=20;j++) {
				Cell cell= row.createCell(columnNumber++);
				cell.setCellValue("row "+i+"column"+j);	
			}
		}
		//set the path
		String path = System.getProperty("user.dir")+"/src/test/resources/TestDataExcel/excel1.xlsx";
		File excelfile = new File(path);
		FileOutputStream fos = null;
		
		try {
			fos=new FileOutputStream(excelfile);
			workbook1.write(fos);
			workbook1.close();
		}
		
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		finally {
			fos.close();
		}
		
		
	}
	
	public static void readExcelSheet () throws IOException {
		//set the path
		String path = System.getProperty("user.dir")+"/src/test/resources/TestDataExcel/excel1.xlsx";
		File excelfile = new File(path);
		//fore excel read we are usinh fileinputstream
		FileInputStream fis = new FileInputStream (excelfile);
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook1.getSheet("sheet one");
		
		Iterator<Row> row = sheet.rowIterator();
		//if excel has next value it iterates
		while (row.hasNext()) {
			Row currentRow=row.next();
			
			Iterator<Cell> cell= currentRow.cellIterator();
			while (cell.hasNext()) {
				Cell currentcell = cell.next();
				System.out.println(currentcell.getStringCellValue()+"*");
			}
			
			System.out.println();
		}
		//write data in particular cell
		Row newrow= sheet.createRow(30);
		Cell newcell =newrow.createCell(15);
		newcell.setCellValue("numpyninza");
		FileOutputStream fos = new FileOutputStream(excelfile);
		workbook1.write(fos);
		workbook1.close();
		
		
	}

public static void main(String[] args) throws IOException {
	
	//writeExcelSheet ();
	readExcelSheet ();
}
			
}
