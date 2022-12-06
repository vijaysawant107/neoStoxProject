package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStockPassccode 
{
	@FindBy(xpath = "//input[@id='txt_accesspin']")private WebElement passcode;
	@FindBy(xpath = "//a[text()='Submit']")private WebElement submitbtn;
	@FindBy(xpath = "(//a[@class='btn btn-sm neobutton'])[7]")private WebElement popupok;
	@FindBy(xpath = "(//a[@class='neobutton'])[25]")private WebElement closebtn;
	
public NeoStockPassccode(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterpasscode(String pass)
{
 passcode.sendKeys(pass);	
 Reporter.log("Sending Passcode", true);
}

public void clickonsubmit() throws InterruptedException
{
	submitbtn.click();
	Reporter.log("clicking on submit", true);
	Thread.sleep(1000);
}
public void clickonok() throws InterruptedException
{
	popupok.click();
	Reporter.log("Closing 1st popup", true);
	Thread.sleep(1000);
}
public void clickonclose() throws InterruptedException
{
	closebtn.click();
	Reporter.log("closing 2nd popup", true);
	Thread.sleep(1000);
}
}
