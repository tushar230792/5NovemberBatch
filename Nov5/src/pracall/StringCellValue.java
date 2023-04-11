package pracall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringCellValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream ("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
String data = WorkbookFactory.create(file).getSheet("sheet2").getRow(7).getCell(4)
.getStringCellValue();

System.out.println(data);


		
	}

}
