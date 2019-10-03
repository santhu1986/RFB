package scripts;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gridwd 
{
DesiredCapabilities cap=null;
@Parameters("browser")
@Test
public void Grid(String Br) throws MalformedURLException
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
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.160:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.partialLinkText("Gm")).click();
/*	Sleeper.sleepTightInSeconds(8);
Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"))).build().perform();
Sleeper.sleepTightInSeconds(6);
driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span")).click();
*/

	
}
}
