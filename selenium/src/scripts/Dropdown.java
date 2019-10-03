package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

		public static void main(String[] args) 
		{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement bMonth=driver.findElement(By.name("birthday_month"));
		Select month = new Select(bMonth);
		//month.selectByVisibleText("Aug");
		//month.selectByIndex(8);
		//month.selectByValue("8");
		if (!month.isMultiple())
		{
		List<WebElement> allMonths = month.getOptions();
		System.out.println("Total Options in Months drop down are : "
		+ allMonths.size());
		for (int i=0; i<allMonths.size(); i++)
		{
		String monthName = allMonths.get(i).getText();
		System.out.println(monthName);
		if (monthName.equals("Jan"))
		{
		month.selectByIndex(i);
		break;
		}
		}
		}
		}
}