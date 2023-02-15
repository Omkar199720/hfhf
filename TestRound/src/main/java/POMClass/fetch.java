package POMClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch {
	   
	 
	   public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		  
	  String path = "C:\\Users\\omkar wagh\\OneDrive\\Documents\\Book1.xlsx";
	  FileInputStream file = new FileInputStream (path);
     
  	 Workbook hi = WorkbookFactory.create(file);
  			Sheet ok = hi.getSheet("Sheet1");
  			  int last = ok.getLastRowNum();
		       System.out.println(last);
		       for(int i =0;i<=last;i++) {
		    	   for(int j=0;j<=1;j++) {
		    	
   String jj = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();		       
			System.out.println(jj);
		    	   }
	 }
	   }}
	
	   


