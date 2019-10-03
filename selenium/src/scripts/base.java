package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class base 
{
	Lib1 LB=new Lib1();
  
  @BeforeTest
  public void beforeTest() 
  {
  LB.login();
  }

  @AfterTest
  public void afterTest()
  {
  LB.Logout();
  }

  @BeforeSuite
  public void beforeSuite()
  {
  LB.launch();
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Aclose();
  }

}
