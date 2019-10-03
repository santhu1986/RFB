package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bsh.Capabilities;

public class Gridsel 
{
DesiredCapabilities cap=null;
@Parameters("browser")
@Test
public void Gexe(String Br) throws MalformedURLException
{
	if (Br.equalsIgnoreCase("firefox"))
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
			}
	else if (Br.equalsIgnoreCase("chrome")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
			}
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	driver.get("http://seoemirates.com/Build2/home.aspx");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	}

}
