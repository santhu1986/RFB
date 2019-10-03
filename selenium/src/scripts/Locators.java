package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Locators {

public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
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
