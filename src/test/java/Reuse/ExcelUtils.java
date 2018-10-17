package Reuse;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.sourceforge.htmlunit.corejs.javascript.ast.CatchClause;

public class ExcelUtils {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	
	
	
	public ArrayList<String> GetDataFile() throws Exception{
		//initialize array list
		ArrayList<String> applicantData = new ArrayList<String>();
		
		try {
		 //Get Excel File Location
        FileInputStream file = new FileInputStream("C:\\Users\\Rejoicem\\eclipse-workspace\\Hybrid_Framework\\src\\test\\java\\Resources\\DataFile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);	
		//iterate excel rows to get data for each column
        for (int i = 0; i < 2; i++) {
            String data = sheet.getRow(1).getCell(i).getStringCellValue();
            applicantData.add(data);
           
        }
        
	}catch (Exception e) {
		
	}
		
return applicantData;
}
	
	
	
	
	
}