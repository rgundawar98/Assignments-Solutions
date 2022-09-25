package MavenProject.MavenProjectTest;


import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateInvoices 
{
	public static void main(String[] args) {
		
	
	try
	{
		//create a workbook in .xlsx format
		Workbook wb = new XSSFWorkbook();
		
		//create a sheet
		Sheet sh = wb.createSheet("Invoices");
		
		//create top row with column heading
		String[] columnHeading = {"Item id","Item Name","Quantity","Item Price","Sold Date"};
		
		//we want to make it bold with a foreground color
		Font headerfont = wb.createFont();
		headerfont.setBold(true);
		headerfont.setFontHeightInPoints((short)12);
		headerfont.setColor(IndexedColors.BLACK.index);
		//Create a cell style with the font
		CellStyle headerstyle = wb.createCellStyle();
		headerstyle.setFont(headerfont);
		headerstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		headerstyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
		//create the header row
		Row headerRow = sh.createRow(0);
		//Iterate over the column heading to create column
		for(int i=0;i<columnHeading.length;i++)
		{
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columnHeading[i]);
			cell.setCellStyle(headerstyle);
		}
		//fill data
		ArrayList<Invoices> a = createData();
		CreationHelper crhelper= wb.getCreationHelper();
		CellStyle datestyle = wb.createCellStyle();
		datestyle.setDataFormat(crhelper.createDataFormat().getFormat("MM/dd/yyyy"));
		int rownum = 1;
		for(Invoices i : a)
		{
			Row row = sh.createRow(rownum++);
			row.createCell(0).setCellValue(i.getItemId());
			row.createCell(1).setCellValue(i.getItemName());
			row.createCell(2).setCellValue(i.getItemQty());
			row.createCell(3).setCellValue(i.getTotalprice());
			Cell datecell = row.createCell(4);
		    datecell.setCellValue(i.getItemSoldDate());
		    datecell.setCellStyle(datestyle);  
		}
		//Autosize coloumn
		for(int i=0;i<columnHeading.length;i++)
		{
			sh.autoSizeColumn(i);
		}
		Sheet sh2 = wb.createSheet("Second");
		//write output to file
		FileOutputStream fos = new FileOutputStream("Invoices.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("Completed");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }

	private static ArrayList<Invoices> createData() throws ParseException 
	{
		ArrayList<Invoices> a = createData();
		a.add(new Invoices(1, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(2, "Table", 1, 50.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(3, "Lamp", 5, 100.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(4, "Pen", 100, 20.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(5, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(6, "Table", 1, 50.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(7, "Lamp", 5, 100.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(8, "pen", 100, 20.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(9, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(10, "Table", 1, 50.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(11, "Lamp", 5, 100.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(12, "pen", 100, 20.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(13, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(14, "Table", 1, 50.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(15, "Lamp", 5, 100.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
		return a;
	}
}
