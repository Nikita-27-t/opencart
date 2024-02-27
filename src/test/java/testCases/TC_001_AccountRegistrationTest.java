package testCases;



import org.testng.Assert;
import org.testng.annotations.*;

import pageObject.AccountRegistration;
import pageObject.HomePage;

import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

@Test(groups= {"regression","master"})
public void Verify_AccountRegistration() {
	try {
    logger.info("****** starting TC_001_AccountRegistrationTest *******");
    logger.debug("application log started.....");
	HomePage hp = new HomePage(driver);
	logger.info("Clicking on Registration link");
	hp.ClickRegister();
	AccountRegistration reg = new AccountRegistration(driver);
	logger.info("Entering customer information");
	reg.setGender();
	reg.setFirstname(randomString());
	reg.setLastname(randomString());
	reg.setDay("7");
	reg.setMonth("February");
	reg.setYear("1997");
	reg.setEmail(randomString()+"@gmail.com");
	String password = randomAlphaNumeric();
	reg.setPassword(password);
	reg.setConfirmPassword(password);
	logger.info("Clicked on Register button.....");
	reg.ClickOnRegister();
	logger.info("Validating expected mssg.....");
	
	String conmssg=reg.getConfirmationmssg();
	if(conmssg.equals("Your registration completed")) {
		Assert.assertTrue(true);
	}
	else {
		logger.info("test failed....");
		Assert.fail();
	}
	
	}
	catch(Exception e) {
		logger.error("test failed....");
		Assert.fail();
	}
logger.info("****** Finished TC_001_AccountRegistrationTest *******");
logger.debug("application log finished....");
}

}
