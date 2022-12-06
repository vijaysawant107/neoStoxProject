package neoStoxPOMClasses;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;





public class SignIn
{
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement MobNum;
	@FindBy(xpath = "//a[@id='lnk_signup1']")private WebElement signinbtn;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNum(String Mobno) 
	{
		MobNum.sendKeys(Mobno);
		
		Reporter.log("Sending Mobile number", true);
		
	}
	public void clickonsignin()
	{
		signinbtn.click();
		Reporter.log("Clicking on signin Button", true);
	}

}
