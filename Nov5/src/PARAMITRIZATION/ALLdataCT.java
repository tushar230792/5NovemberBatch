package PARAMITRIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ALLdataCT {
	
			
			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				
				FileInputStream file= new FileInputStream("C:\\Users\\tushar\\Documents\\tush.xlsx");
				
				 Sheet cellonfo = WorkbookFactory.create(file).getSheet("Sheet1");
				 
				 for(int i=0; i<=cellonfo.getLastRowNum(); i++)   {
					 
					 for(int j=0; j<cellonfo.getRow(i).getLastCellNum(); j++)  {
						 
						Cell cell = cellonfo.getRow(i).getCell(j);
						
						CellType CT = cell.getCellType();
						
						if(CT==CellType.STRING) {
							
							System.out.print(" "+cell.getStringCellValue()+" ");
						}
							
							else if (CT==CellType.NUMERIC) {
								
								System.out.print(""+cell.getNumericCellValue()+" ");
							}
						
							else if(CT==CellType.BOOLEAN)   {
								
								System.out.print(" "+cell.getBooleanCellValue()+" ");
								
							}
					 }
					 System.out.println();
				 }
			}
}
