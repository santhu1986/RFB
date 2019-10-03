package Sel_pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.santhosh-PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/webhp?hl=en&sa=X&ved=0ahUKEwjNwOKEufLZAhXMP48KHRUFAXgQPAgD&gws_rd=cr&dcr=0&ei=n5CsWoSoMszPvgT5orLQBA");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
         //Sleeper.sleepTightInSeconds(5);
         driver.findElement(By.name("q")).sendKeys("Admin");
         driver.findElement(By.id("txtPword")).sendKeys("Admin");
         driver.findElement(By.id("login")).click();

	}

}
