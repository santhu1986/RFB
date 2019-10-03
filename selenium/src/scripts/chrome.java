package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class chrome {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Santhosh\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
	/*
		
	driver.get("http://192.168.1.4/ranford2");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
         Sleeper.sleepTightInSeconds(5);
   driver.findElement(By.name("txtuId")).sendKeys("Admin");
   Sleeper.sleepTightInSeconds(5);	
  driver.findElement(By.id("txtPword")).sendKeys("Admin.");
 		driver.findElement(By.id("login")).click();
 		Sleeper.sleepTightInSeconds(5);
*/// 	/*	String x=driver.switchTo().alert().getText();
// 		System.out.println(x);
//*/ 		//driver.findElement(By.name("txtuId")).sendKeys("Admin");
//        /* driver.findElement(By.id("Email")).sendKeys("testmindq");
//         driver.findElement(By.id("next")).click();
//        */
//		/*driver.get("http://opensource.demo.orangehrmlive.com/");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin");
//		driver.findElement(By.id("btnLogin")).click();
//*/
	}

}
