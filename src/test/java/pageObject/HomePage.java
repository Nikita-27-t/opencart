package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
WebDriver driver;
public HomePage(WebDriver driver) {
	super(driver);
}

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement linkregister;

@FindBy(xpath="//a[normalize-space()='Log in']")
WebElement linklogin;

public void ClickRegister() {
	linkregister.click();
}

public void ClickLogin() {
	linklogin.click();
}
}
