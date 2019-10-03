package scripts;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestNG 
{
public static WebDriver driver;
public static String Expval,Actval;

@Test(priority=1)
public void launch()
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com");
	
}
@Test(priority=2)
public void login()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
}
@Test(priority=3)
public void rec()
{
	WebDriver.Navigation m=driver.navigate();
	driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewRecruitmentModule']/b")).click();
	driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewCandidates']")).click();
	Sleeper.sleepTightInSeconds(4);
	Select Jtitle=new Select(driver.findElement(By.xpath(".//*[@id='candidateSearch_jobTitle']")));
	
	Jtitle.selectByVisibleText("HR Manager");
	Sleeper.sleepTightInSeconds(4);
	m.back();
}
@Test(priority=4)
public void Logout()
{
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(".//*[@id='welcome']")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
}
}
