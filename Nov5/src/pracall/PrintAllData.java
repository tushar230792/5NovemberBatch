package pracall;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllData {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream ("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
		 Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet2");
		 
		int rowsize = sheet1.getLastRowNum();
		
		System.out.println(rowsize);
		 
		 short columnsize = sheet1.getRow(0).getLastCellNum();
		
		System.out.println(columnsize);
		 
		 for(int i=0; i<rowsize; i++)   {
			 
			 for(int j=0; j<columnsize; j++)  {
				 
				String data = sheet1.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.print(" "+data);
			 }
			 
			 System.out.println();
			 
			 
		 }
		
		
	

}
}
