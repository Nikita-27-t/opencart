package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistration extends BasePage {
WebDriver driver;	
public AccountRegistration(WebDriver driver) {
	super(driver);
}

@FindBy(xpath="//input[@id='gender-female']")
WebElement rd_gender_loc;

@FindBy(xpath="//input[@id='FirstName']")
WebElement txt_firstname_loc;

@FindBy(xpath="//input[@id='LastName']")
WebElement txt_lastname_loc;

@FindBy(xpath="//select[@name='DateOfBirthDay']")
WebElement drp_DateOfBirthDay_loc;

@FindBy(xpath="//select[@name='DateOfBirthMonth']")
WebElement drp_DateOfBirthMonth_loc;

@FindBy(xpath="//select[@name='DateOfBirthYear']")
WebElement drp_DateOfBirthYear_loc;

@FindBy(xpath="//input[@id='Email']")
WebElement txt_Email_loc;

@FindBy(xpath="//input[@id='Password']")
WebElement txt_password_loc;

@FindBy(xpath="//input[@id='ConfirmPassword']")
WebElement txt_confirmpassword_loc;

@FindBy(xpath="//button[@id='register-button']")
WebElement btn_register_loc;

@FindBy(xpath="//div[@class='result']")
WebElement txt_confirmationMssg_loc;

 public void setGender() {
	 rd_gender_loc.click();
 }
 public void setFirstname(String fname) {
	 txt_firstname_loc.sendKeys(fname);
 }
 public void setLastname(String lname) {
	 txt_lastname_loc.sendKeys(lname);
 }
 public void setDay(String day) {
	 Select opt= new Select(drp_DateOfBirthDay_loc);
	 opt.selectByVisibleText(day);
 }
 public void setMonth(String month) {
	 Select opt= new Select(drp_DateOfBirthMonth_loc);
	 opt.selectByVisibleText(month);
 }
 public void setYear(String year) {
	 Select opt= new Select(drp_DateOfBirthYear_loc);
	 opt.selectByVisibleText(year);
 }
 public void setEmail(String Email) {
	 txt_Email_loc.sendKeys(Email); 
 }
 
 public void setPassword(String Password) {
	 txt_password_loc.sendKeys(Password); 
 }
 public void setConfirmPassword(String confirmPassword) {
	 txt_confirmpassword_loc.sendKeys(confirmPassword); 
 }
 public void ClickOnRegister() {
	 btn_register_loc.click();
 }
 public String getConfirmationmssg() {
	 try {
		 return txt_confirmationMssg_loc.getText();
	 }
	 catch(Exception e) {
		 return(e.getMessage());
	 }
 }
}
