package pracall;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDiff {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\tushar\\Documents\\tush.xlsx");
	
      Sheet sheet2 = WorkbookFactory.create(file).getSheet("sheet2");
      
      for(int i=0; i<sheet2.getLastRowNum(); i++)  {
    	  
    	  for(int j=0;j<sheet2.getRow(i).getLastCellNum(); j++)   {
    		  
    		Cell cellinfo = sheet2.getRow(i).getCell(j);
    		
    		CellType CT = cellinfo.getCellType();
    		
    		if(CT==CellType.STRING)   {
    			
    			System.out.print(" "+cellinfo.getStringCellValue()+" ");
    		}
    			
    			else if(CT==CellType.NUMERIC)  {
    				
    				System.out.print(" "+cellinfo.getNumericCellValue()+" ");
    				
    			}
    				
    				else if (CT==CellType.BOOLEAN)   {
    					
    					System.out.print(" "+cellinfo.getBooleanCellValue()+" ");
        				
    				}		
    			}
    				System.out.println();
    				
    				
    			}
    		}
    	  
      
    	  
    	  
      }
        
       
