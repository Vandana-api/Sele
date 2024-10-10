package VANDANA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *  this is a generic class for data testing
 */


public class FILELIB {
	/** 
	 * this is a generic method for reading the data from property file
	 * @param key 
	 
	 * @return data
	 * @throws IOException 
	 * @throws 
	 */

	public  String getPropertyData (String key) throws IOException {
		
		FileInputStream fis =new FileInputStream("./DATA/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		
		String data=p.getProperty(key);
		return data;

	}
	
	/** 
	 * this is a generic method for reading the data from excel file
	 * @param  SheetName  * @param  row    * @param  cell
	 * @param  row
	 * @param  cell
	 
	 * @return 
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 
	 */
	
public  String getExcelData ( String SheetName, int row, int cell ) throws EncryptedDocumentException, IOException  {
		
		FileInputStream fis =new FileInputStream("./DATA/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		String  data =wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
				   System.out.println(data);
				return data;
		
		
		

	}

/** 
 * this is a generic method for reading the data from excel file
 * @param  SheetName
 * @param  row
 * @param  cell
 * @param  data
 
 * @return 
 * @throws IOException 
 * @throws EncryptedDocumentException 
 
 */


public void  setExcelData ( String SheetName, int row, int cell , String data ) throws EncryptedDocumentException, IOException  {
	
	FileInputStream fis =new FileInputStream("./DATA/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	
	wb.getSheet(SheetName).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./DATA/testscript.xlsx");
	wb.write(fos);

}

}