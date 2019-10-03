package scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailDP 

{
	Lib LB=new Lib();
	
	@Test
	public void Launch() throws IOException
	{
LB.Launch("http://www.google.com");
}
	
	@Test(dataProvider="Gdata")
	public void login(String Un,String Pwd) throws IOException
	{
		LB.Login(Un,Pwd);
	}
	
	
	@DataProvider
	
	public Object[][] Gdata()
	{
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="testmindq";
		Obj[0][1]="mindqsystems";
		
		Obj[1][0]="venkatareddy.bala";
		Obj[1][1]="mindqsys";
		
		Obj[2][0]="santhumiryala";
		Obj[2][1]="mindqsystems";
		
	return Obj;	
		
	}
}