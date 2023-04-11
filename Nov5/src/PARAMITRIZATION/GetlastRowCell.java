package PARAMITRIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetlastRowCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream file=new FileInputStream("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
		int data1 = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		
      System.out.println(data1);
		

	}
		
	}
	
	


