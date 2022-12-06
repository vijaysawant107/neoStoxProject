package neoStoxTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class neoStockBaseClass 
{
	protected WebDriver driver ;
	public  void launchbrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(NeoStockUtility.propertyFile("Url"));
		NeoStockUtility.wait(driver, 2000);
	
	}

}
