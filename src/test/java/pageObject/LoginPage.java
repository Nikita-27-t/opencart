package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	
public LoginPage(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//a[normalize-space()='Log in']")
WebElement link_login_loc;

@FindBy(xpath ="//input[@id='Email']")
WebElement txt_email_loc;

@FindBy(xpath="//input[@id='Password']")
WebElement txt_password_loc;

@FindBy(xpath="//button[normalize-space()='Log in']")
WebElement btn_login_loc;


public void setEmail(String email) {
	txt_email_loc.sendKeys(email);
}
public void setPassword(String password) {
	txt_password_loc.sendKeys(password);
}

public void ClickLogin() {
	btn_login_loc.click();
}
}


