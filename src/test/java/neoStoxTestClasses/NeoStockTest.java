package neoStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxPOMClasses.NEoStockHome;
import neoStoxPOMClasses.NeoStockPassccode;
import neoStoxPOMClasses.SignIn;


public class NeoStockTest extends neoStockBaseClass 
{
	SignIn signin;
	NeoStockPassccode passcode;
	NEoStockHome home;
	
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		launchbrowser();
		signin=new SignIn(driver);
		passcode=new NeoStockPassccode(driver);
		home=new NEoStockHome(driver);
		
		NeoStockUtility.wait(driver, 2000);
		
	}
	@BeforeMethod
	public void sigingin() throws IOException, InterruptedException
	{
	    signin.enterMobNum(NeoStockUtility.propertyFile("MobNumber"));
		signin.clickonsignin();
		NeoStockUtility.wait(driver, 1000);
		passcode.enterpasscode(NeoStockUtility.propertyFile("Passcode"));
		Thread.sleep(1000);
		passcode.clickonsubmit();
		NeoStockUtility.wait(driver, 1000);
		passcode.clickonok();
		NeoStockUtility.wait(driver, 1000);
		passcode.clickonclose();
		
		NeoStockUtility.wait(driver, 1000);
		
	}
  @Test
  public void validatingAcName() throws IOException 
  {
	 Assert.assertEquals(home.acName(),NeoStockUtility.propertyFile("expectedAcName"));
  }
  
  @AfterMethod
  public void logout()
  {
	 home.clickonacname();
	 home.clickonlogout();
  }
  
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
}
