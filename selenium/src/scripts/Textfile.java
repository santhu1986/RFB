package scripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Textfile {

	
	public static void main(String[] args) throws IOException
	{
		Lib LB=new Lib();
		String Res=LB.Launch("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		System.out.println(Res);
			
	//Read
		String SD;
		FileReader FR=new FileReader("C:\\Users\\santhosh.santhosh-PC\\Desktop\\Role.txt");
		BufferedReader BR=new BufferedReader(FR);
		String SR=BR.readLine();
	    System.out.println(SR);
	    
	    //write
	    
	    FileWriter FW=new FileWriter("C:\\Users\\santhosh.santhosh-PC\\Desktop\\RoleRes.txt");
	    BufferedWriter BW=new BufferedWriter(FW);
	    BW.write(SR);
	    BW.newLine();
	    
	    //while loop
	    
	    while((SD=BR.readLine())!=null)
	    {
		System.out.println(SD);
		String S[]=SD.split("###");
		String EM=S[0];
		String P=S[1];
		
		Res=LB.Login(EM,P);
		BW.write(EM+"@@@"+P+"&&&"+Res);
		BW.newLine();
		}
	BW.close();
	BR.close();
	
	}

	
	
}
