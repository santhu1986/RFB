package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Santhosh
 *
 */
public class Gmail 
{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Santhosh\\Desktop\\geckodriver.exe");
           WebDriver driver=new FirefoxDriver();
           driver.get("http://www.gmail.com");
           driver.manage().window().maximize();
           driver.findElement(By.id("identifierId")).sendKeys("testmindq");
           driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
         Thread.sleep(4000);
           driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("testingmindq");
           Thread.sleep(4000);
           driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
           
           
           
	}

}