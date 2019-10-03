package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Rlib
{

	public static WebDriver driver;

public void OpenApp(String Url)
{
	driver=new FirefoxDriver();
    driver.get(Url);
    driver.manage().window().maximize();
    }

public void CAccbutton()
{
	driver.findElement(By.xpath(".//*[@id='ow209']/content/span")).click();
    Sleeper.sleepTightInSeconds(5);
    driver.findElement(By.xpath(".//*[@id='initialView']/div[2]/div[3]/div/div/content[1]/div[2]/div")).click();
    
}
public String Reg(String FN,String LN,String Em,String CP,String PC,String Mnt,String Dt,String Yer,String Gen,String MN) throws InterruptedException
{
	   driver.findElement(By.id("FirstName")).sendKeys(FN);
	   driver.findElement(By.id("LastName")).sendKeys(LN);
	   driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys(Em);
	   driver.findElement(By.id("Passwd")).sendKeys(CP);
	   driver.findElement(By.id("PasswdAgain")).sendKeys(PC);
	   Sleeper.sleepTightInSeconds(5);
	   Actions obj=new Actions(driver);
		driver.findElement(By.id(":0")).click();
		obj.sendKeys(Keys.chord(Mnt)).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.id("BirthDay")).sendKeys(Dt);
/*	   Select Mt=new Select(driver.findElement(By.id("month-label")));
	   Mt.selectByIndex(3);
	   Sleeper.sleepTightInSeconds(3);
	   driver.findElement(By.id("BirthDay")).sendKeys(Dt);
*/	   driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys(Yer);
	   Sleeper.sleepTightInSeconds(5);
	   driver.findElement(By.id(":d")).click();
  		obj.sendKeys(Keys.chord(Gen)).sendKeys(Keys.ENTER).perform();
  		
	   
	   /*   Select Gn=new Select(driver.findElement(By.xpath(".//*[@id='Gender']/div")));
	   Gn.selectByVisibleText(Gen);
	*/ 
	   Sleeper.sleepTightInSeconds(5);
	   driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys(MN);
	   driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
	   
	   Sleeper.sleepTightInSeconds(5);
	   driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	   driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	   driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	   Sleeper.sleepTightInSeconds(5);
	   driver.findElement(By.id("iagreebutton")).click();

	   return "Succ Registered";
}
}
