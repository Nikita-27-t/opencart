package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
@Test(groups= {"sanity","master"})	
 public void verify_login() {
	 logger.info("***** Starting TC_002_LoginTest *****");
	 logger.debug("capturing application debug logs.....");
	try {
	
	 HomePage hp = new HomePage(driver);
	 hp.ClickLogin();
	 logger.info("Clicked on Login link.....");
	 
	 LoginPage lp = new LoginPage(driver);
	 logger.info("entering valid email....");
	 lp.setEmail(p.getProperty("email"));
	 logger.info("entering valid password....");
	 lp.setPassword(p.getProperty("password"));
	 logger.info("clicking on login button....");
	 lp.ClickLogin();
	 
	 
	 //my account validation
	 MyAccountPage macc =new  MyAccountPage(driver);
	 boolean targetpage=macc.isMyAccountPageExists();
	 if(targetpage==true) {
		 logger.info("login test passed....");
		 
		 Assert.assertTrue(true);
	 }
	 else {
		 logger.error("login test failed");
		 Assert.fail();
	 }
	}
	catch(Exception e) {
		Assert.fail();
	}
	logger.info("***** Finished TC_002_LoginTest *****");
 }
}
