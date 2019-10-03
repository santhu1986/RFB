package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class harish {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Santhosh\\Desktop\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	Thread.sleep(4000);
	driver.findElement(By.linkText("Leave")).click();
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//*[@id='menu_leave_Reports']"))).build().perform();
	//driver.findElement(By.linkText("Leave Entitlements and Usage Report")).click();
	Thread.sleep(2000);
	a.moveToElement(driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveBalanceReport']"))).sendKeys(Keys.ENTER).build().perform();
    System.out.println("passed");
	
	
	}

}
