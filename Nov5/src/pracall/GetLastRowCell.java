package pracall;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastRowCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream ("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
		int data1 = WorkbookFactory.create(file).getSheet("sheet2").getLastRowNum();
		
		System.out.println(data1);
	}

}
