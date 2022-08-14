package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell  {
	public static void main(String[] args) throws Exception {
		
	
	
	
	
		
	
	String path="C:\\Users\\Rahul\\HOS_Maven\\InterviewDemo\\TestData\\Book1.xlsx";
	File file=new File(path);
	FileInputStream fis= new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum();
	System.out.println(rowCount);
	String value=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	for(int i=0;i<=rowCount;i++)
	{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<=row.getLastCellNum();j++)
		{
			String data=sheet.getRow(i).getCell(j).getStringCellValue();
			//String str=row.getCell(j).getStringCellValue();
			System.out.print(data);
		}
		System.out.println();
	}
	}
}
