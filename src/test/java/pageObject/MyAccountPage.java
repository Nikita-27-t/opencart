package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccountPage extends BasePage{
public MyAccountPage(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//a[@class='ico-account']")//yeh dekho
WebElement msgHeading;

@FindBy(xpath="//a[normalize-space()='Log out']")
WebElement lnklogout;
 

public boolean isMyAccountPageExists() {
	try {
		return(msgHeading.isDisplayed());
	}
	catch(Exception e) {
		return (false);
	}
}
public void clickLogout() {
	lnklogout.click();
}
}
