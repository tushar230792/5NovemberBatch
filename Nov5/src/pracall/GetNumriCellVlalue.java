package pracall;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumriCellVlalue {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream ("C:\\Users\\tushar\\Documents\\tush.xlsx");
		
 double data = WorkbookFactory.create(file).getSheet("sheet2").getRow(9).getCell(4)
.getNumericCellValue();

System.out.println(data);


}
}
