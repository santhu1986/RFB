package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeLP 
{

@FindBy (xpath=".//*[@id='menu_recruitment_viewRecruitmentModule']/b")
WebElement Rec;

@FindBy (xpath=".//*[@id='menu_recruitment_viewCandidates']")
WebElement cand;

@FindBy (xpath=".//*[@id='welcome']")
WebElement logoptions;

@FindBy (xpath=".//*[@id='welcome-menu']/ul/li[2]/a")
WebElement logout;

public void Recruit()
{
	Rec.click();
}

public void Candidate()
{
	cand.click();
}
public void LOptions()
{
	logoptions.click();
	}
public void Lout()
{
	logout.click();
}
}
