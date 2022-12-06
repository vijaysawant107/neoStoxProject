package neoStoxTestClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class NeoStockUtility 
{
	public static void wait(WebDriver driver,int mili)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(mili));
	}
	public static String propertyFile(String key) throws IOException
	{
		Properties prp=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\investmentBanking\\neoStox.properties");
	    prp.load(myFile);
	    String value = prp.getProperty(key);
	    return value;
	}
	public static void screenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\vijay\\Pictures\\Screenshots\\SeleSs\\"+TCID+".png");
		FileHandler.copy(src, dest);
	}

}
