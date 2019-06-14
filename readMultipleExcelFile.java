package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleExcel {

	public static void main(String[] args) {
		
		ReadMultipleExcel readFileObj=new ReadMultipleExcel();
		final String Path="D:\\excelFile";
		
		File folder = new File(Path);
		List<String> fileList=readFileObj.listFilesForFolder(folder);
		Map<String,List<List<String>>> mapList=readFileObj.readMultpleExcelFile(fileList,Path);
		readFileObj.createSingleExcelFile(mapList);
	}

	
	public  List<String> listFilesForFolder(final File folder) {
	   
		List<String> fileList=new ArrayList<String>();
		
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	        	fileList.add(fileEntry.getName());
	        }
	    }
		return fileList;
	}

	
	public  Map<String,List<List<String>>> readMultpleExcelFile(List<String> fileList,String Path){
		  InputStream inp = null;
		  Map<String,List<List<String>>> mapExcel=new HashedMap<String,List<List<String>>>();
		 try {
			 for (String fileListItem : fileList) {
				 inp = new FileInputStream(Path+"/"+fileListItem);
		            Workbook wb = WorkbookFactory.create(inp);
		            System.out.println("No of Sheet "+wb.getNumberOfSheets());
		            for(int i=0;i<wb.getNumberOfSheets();i++) {
		                System.out.println(i+""+wb.getSheetAt(i).getSheetName());
		                String nameOfFile[]=fileListItem.split("\\.(?=[^\\.]+$)");
		                    mapExcel.put(nameOfFile[0], readExcelSheet(wb.getSheetAt(i)));
		             
		            }
			}
			   
		 }catch (Exception e) {
			 e.printStackTrace();
	}
		return  mapExcel;
	}
	
	public List<List<String>> readExcelSheet(Sheet sheet){
		List<List<String>> allRowsList=new ArrayList<List<String>>();
		try {		
			Row row = null;
	         for (int i = 0; i <= sheet.getLastRowNum(); i++) {
	             row = sheet.getRow(i);
	             List<String> rowList=new ArrayList<String>();
	             for (int j = 0; j < row.getLastCellNum(); j++) {
	            	 rowList.add(row.getCell(j).toString());
	             }
	             allRowsList.add(rowList);
	            
	         }
		}catch (Exception e) {
			e.printStackTrace();
		}
         return allRowsList;
	}
	
	
	public void createSingleExcelFile(Map<String,List<List<String>>> mapList) {
		

        

        // Write the output to a file
        FileOutputStream fileOut;
		try {
			// Create a Workbook
	        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file
	        CreationHelper createHelper = workbook.getCreationHelper();
			fileOut = new FileOutputStream("D:/govindM.xlsx");
			writeSheetData(mapList,workbook,createHelper);
			workbook.write(fileOut);
	        fileOut.close();
           // Closing the workbook
	        workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}
	
	public void writeSheetData(Map<String,List<List<String>>> mapList, Workbook workbook, CreationHelper createHelper) {
		System.out.println("MAP Data"+mapList.toString());
		 for (Entry<String, List<List<String>>> entry : mapList.entrySet())  {
			        // Create a Sheet
			        Sheet sheet = workbook.createSheet(entry.getKey());
			        // Create a Font for styling header cells
			        Font headerFont = workbook.createFont();
			        headerFont.setBold(true);
			        headerFont.setFontHeightInPoints((short) 14);
			        headerFont.setColor(IndexedColors.RED.getIndex());
			    // Create a CellStyle with the font
			        CellStyle headerCellStyle = workbook.createCellStyle();
			        headerCellStyle.setFont(headerFont);
			      // Create Cell Style for formatting Date
			        CellStyle dateCellStyle = workbook.createCellStyle();
			        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));			
			        // Create Other rows and cells with employees data	
			      int columns=0;int rowNum = 0;
			        for(List<String> rowList: entry.getValue()) {
			        	columns=rowList.size();  int cellNo=0;
			        	 Row row = sheet.createRow(rowNum++);
			        	for (String rowStr : rowList) {
			        		 row.createCell(cellNo++).setCellValue(rowStr);
						}
			        }			   
					// Resize all columns to fit the content size
			        for(int i = 0; i < columns; i++) {
			            sheet.autoSizeColumn(i);
			        }
	    }
	
	}	
}
