package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException 
	{
		Lib LB=new Lib();
		String Res=LB.Launch("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		System.out.println(Res);
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\Gmail1.xlsx");
	
	//creating workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//sheet
		
		XSSFSheet WS=WB.getSheet("data");
		
		//row count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//Loop-------------For(multiple interations)
		
		for (int i=1;i <=Rc;i++) 
		{
			//row
			
			XSSFRow WR=WS.getRow(i);
			
			//cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell Wc1=WR.getCell(1);
			XSSFCell Wc2=WR.createCell(2);
			
			String Email=WC.getStringCellValue();
			String Pswd=Wc1.getStringCellValue();
			
			Res=LB.Login(Email,Pswd);
		System.out.println(Res);
		Wc2.setCellValue(Res);
		}
	FileOutputStream Fso=new FileOutputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\ResGmail.xlsx");
	WB.write(Fso);
	WB.close();
/*	//row
		
		XSSFRow WR=WS.getRow(3);
		
		//cell
		
		XSSFCell WC=WR.getCell(0);
		String dt=WC.getStringCellValue();
		System.out.println(dt);
*/	
	}

}
