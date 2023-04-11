package PARAMITRIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramitrization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
     //	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
	//	System.out.println(data);
		
    //      double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		
	//	System.out.println(data);
      
	//	boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(4).getBooleanCellValue();

	//	System.out.println(data);
		
		int data2 = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(data2);
	}

}
