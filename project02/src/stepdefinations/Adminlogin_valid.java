package stepdefinations;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import atu.testrecorder.ATUTestRecorder;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Adminlogin_valid {

	WebDriver driver;
	ATUTestRecorder recorder;

	@Given("^user need to open the browser and navigate to orange hrm homepage$")
	public void user_need_to_open_the_browser_and_navigate_to_orange_hrm_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		recorder = new ATUTestRecorder("C:\\Users\\Santhosh\\Desktop\\OTHER JARS\\screenshot\\",
				"admin_login-" + sdf.format(d), false);
		// new ATUTestRecorder(recordingName, isAudioRecordingEnabled)
		recorder.start();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Sleeper.sleepTightInSeconds(3);
	}

	@When("^user pass valid username as \"([^\"]*)\" and password as \"([^\"]*)\" and click on login button$")
	public void user_pass_valid_username_as_and_password_as_and_click_on_login_button(String arg1, String arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^system should display Orange Hrm admin home page$")
	public void system_should_display_Orange_Hrm_admin_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Santhosh\\Desktop\\OTHER JARS\\screenshot\\admin home page.png"));
		Sleeper.sleepTightInSeconds(3);
		driver.close();
		recorder.stop();

	}

}
