package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gd 
{
DesiredCapabilities cap=null;
//@Parameters("browser")
@Test
public void Grid() throws MalformedURLException
{/*
	if (Br.equalsIgnoreCase("firefox"))
	{*/
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	/*}
	else if (Br.equalsIgnoreCase("chrome")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}

*/	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.112:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com/");
    OrangeHP OHP=PageFactory.initElements(driver,OrangeHP.class);
    OHP.login();

}

}

