import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {


	public static void main(String[] args) throws IOException,NullPointerException {
		
		File f = new File("D:\\Apps\\Softwares\\Java\\Learning SS\\demo\\demo.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("abc");
		for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				 Cell c = r.getCell(j);
				 int type = c.getCellType();
			//	 String string = c.getCellFormula();
				// System.out.println(string);
				 if (type == 1) {
					System.out.println(c.getStringCellValue());
				}
//				 if(c.getCellType()==Cell.CELL_TYPE_BLANK)
//				 {//	 System.out.println("Blank");//				 }
				 if(type == 0)
				 { if (DateUtil.isCellDateFormatted(c)) {
						 Date d = c.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
						System.out.println(sdf.format(d));
					} else
					{
						double dd = c.getNumericCellValue();
						long l = (long)dd;
						System.out.println(String.valueOf(l));
					}
				 }
				 if (c.getCellType()==Cell.CELL_TYPE_FORMULA) {
					 System.out.println(c.getCellFormula());
				}
			}
		}
			
	}
	

}
