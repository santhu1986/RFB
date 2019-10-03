package scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class GmailReg {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
      //Instance class
		Rlib Lb=new Rlib();
		
		Lb.OpenApp("http://www.gmail.com");
        Lb.CAccbutton();
        
        //Excel Test Data File Path
        
        FileInputStream Fis=new FileInputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\Gmail.xlsx");
	//Workbook
        XSSFWorkbook Wb=new XSSFWorkbook(Fis);
        //Sheet
        XSSFSheet Ws=Wb.getSheet("Sheet1");
        //Row count
       int Rcount=Ws.getLastRowNum();
       System.out.println(Rcount);
       
       //Multiple Iterations----For loop
       
       for (int i =1; i <=Rcount; i++) 
       {
    	   //XSSFRow Wr=Ws.getRow(i);
    	   
    	   //Cell
    	   
    	   String FN=Ws.getRow(i).getCell(0).getStringCellValue();
    	   String LN=Ws.getRow(i).getCell(1).getStringCellValue();
    	   String Em=Ws.getRow(i).getCell(2).getStringCellValue();
    	   String CP=Ws.getRow(i).getCell(3).getStringCellValue();
    	   String PC=Ws.getRow(i).getCell(4).getStringCellValue();
    	   String Mnt=Ws.getRow(i).getCell(5).getStringCellValue();
    	   String Dt=Ws.getRow(i).getCell(6).getStringCellValue();
    	   String Yer=Ws.getRow(i).getCell(7).getStringCellValue();
    	   String Gen=Ws.getRow(i).getCell(8).getStringCellValue();
    	   String MN=Ws.getRow(i).getCell(9).getStringCellValue();
    	   Sleeper.sleepTightInSeconds(5);
    	   
    	   
    	   
    	   String Retval=Lb.Reg(FN,LN,Em,CP,PC,Mnt,Dt,Yer,Gen,MN);
    	   Ws.getRow(i).createCell(10).setCellValue(Retval);
    		}
       //Exporting Results
       
       FileOutputStream Fos=new FileOutputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\GmailRes.xlsx");
        Wb.write(Fos);
        Wb.close();
	
	}

}
