package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Flipkart {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Sleeper.sleepTightInSeconds(8);
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"))).build().perform();
	Sleeper.sleepTightInSeconds(6);
	driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/a[4]/span")).click();
	
	}

}
