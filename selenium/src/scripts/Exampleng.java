package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exampleng 
{
	@Test(priority=3)
public void xyz()
{
Assert.assertEquals("Selenium","Selenium");	
}
	@Test(priority=2)
public void abc()
{

Assert.assertEquals("orange","orange");	
}
	@Test(priority=1)
public void pqr()
{
	Assert.assertEquals("Gmail","Gmail");	
}

}
