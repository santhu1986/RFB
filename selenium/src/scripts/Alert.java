package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alert 
{
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.confirm('selenium')");
		Sleeper.sleepTightInSeconds(4);
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		Sleeper.sleepTightInSeconds(4);
	    driver.switchTo().alert().dismiss();
		
	}

}
