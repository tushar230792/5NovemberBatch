package PARAMITRIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printalldata2 {
			
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
					
		FileInputStream file=new FileInputStream ("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
	Sheet Sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
	
	for(int i=0; i<=Sheet1.getLastRowNum(); i++)  {
		
		for(int j=0; j<=Sheet1.getRow(i).getLastCellNum()-1; j++) {
			
			String data = Sheet1.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(" "+data);
		}
		
		System.out.println();
	}
	
	

}
}

