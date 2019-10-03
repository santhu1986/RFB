package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHP 
{

	@FindBy (id="txtUsername")
	WebElement Uname;
	
	@FindBy (id="txtPassword")
	WebElement Pwd;
	
	@FindBy (xpath=".//*[@id='btnLogin']")
	WebElement Lgn;
	
	
	public void login()
	{
		Uname.sendKeys("Admin");
		Pwd.sendKeys("admin");
		Lgn.click();
	}
	
}
