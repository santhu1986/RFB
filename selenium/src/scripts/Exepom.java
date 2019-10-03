package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom 
{
	@Test
public void exelogin()
{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\santhosh.santhosh-PC\\Desktop\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com/");
    OrangeHP OHP=PageFactory.initElements(driver,OrangeHP.class);
    OHP.login();
    OrangeLP OLP=PageFactory.initElements(driver,OrangeLP.class);
    //OLP.Recruit();
    //OLP.Candidate();
    Sleeper.sleepTightInSeconds(4);
    OLP.LOptions();
    OLP.Lout();
}
}
