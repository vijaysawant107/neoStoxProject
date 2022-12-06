package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NEoStockHome 
{
	@FindBy (xpath = "(//span[text()='Hi Vijay Sawant'])[1]")private WebElement acname;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logoutbutton;
	
public NEoStockHome(WebDriver driver)
{
 PageFactory.initElements(driver, this);	
}

public String acName()
{
  String name = acname.getText();
  return name;
}
public void clickonacname()
{
 acname.click();	
 Reporter.log("Clicking on account name", true);
}
public void clickonlogout()
{
 logoutbutton.click();
 Reporter.log("Clicking on Logout Button", true);
}
}
