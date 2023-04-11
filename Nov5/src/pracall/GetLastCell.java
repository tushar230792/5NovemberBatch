package pracall;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream ("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
    short lastcellnumber = WorkbookFactory.create(file).getSheet("sheet2").getRow(4).getLastCellNum();
    
    System.out.println(lastcellnumber);
	}

}
