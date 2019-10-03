package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Webdriver {

	public static void main(String[] args) 
	{
		String Expval="Google";
		//firefox
		WebDriver driver=new FirefoxDriver();
		//maximum size(maximize)
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		WebDriver.Navigation move=driver.navigate();
		move.to("http://www.google.co.in");
		String text=driver.findElement(By.id("gb_70")).getAttribute("id");
		System.out.println(text);
		//title
		/*String Actval=driver.getTitle();
		System.out.println(Actval);
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Google page is displayed");	
		}
		else
		{
			System.out.println("Google page is not displayed");
		}
		driver.findElement(By.partialLinkText("Gm")).click();
		//String tit=driver.getPageSource();
		//System.out.println(tit);
		move.back();
		Sleeper.sleepTightInSeconds(2);
		move.forward();
		Sleeper.sleepTightInSeconds(2);
		move.refresh();
		
		driver.close();
		
		
		//To launch application
		//driver.get("http://www.google.com");
		//to click the gmail link
		//driver.findElement(By.linkText("Gmail")).click();
		
*/	}

}
