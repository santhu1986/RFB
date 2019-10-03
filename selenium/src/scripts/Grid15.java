package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid15 
{
	DesiredCapabilities cap=null;
	@Parameters("browser")
	@Test
	public void gd(String Br) throws MalformedURLException
	{
		if (Br.equalsIgnoreCase("firefox")) 
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);	
		}
		else if(Br.equalsIgnoreCase("chrome"))
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.160:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_1")).sendKeys("santhosh");
		Sleeper.sleepTightInSeconds(4);
		//driver.findElement(By.id("u_0_1")).clear();
		driver.findElement(By.name("lastname")).sendKeys("mindq");
		driver.findElement(By.cssSelector("#u_0_6")).sendKeys("9885879005");
		driver.findElement(By.partialLinkText("For")).click();

		
	}
}
