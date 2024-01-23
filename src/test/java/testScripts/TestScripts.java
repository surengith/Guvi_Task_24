package testScripts;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pages.org.Login;
import com.pages.org.Signup;
import com.utility.org.BaseClass;


public class TestScripts extends BaseClass {

	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = browserLaunch("firefox");
		driver.get("https://www.demoblaze.com/");
		windowMaximize();
	}

	@Test(priority = 0)
	public void signupTest() throws InterruptedException, IOException {

		Signup sip = new Signup(driver);

		sip.getSignupClick().click();
		sip.getSignupUsername().sendKeys("surendhar44");
		sip.getSignupPassword().sendKeys("demo@321$");
		sip.getSignupButton().click();
		wait(2000);
		String actualMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expectedMessage = "Sign up successful.";
		Assert.assertEquals(actualMessage, expectedMessage, "Sign up successful.");
		screenshot("Signup");
	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException, IOException {
		Login log = new Login(driver);

		log.getLoginClick().click();
		log.getLoginUsername().sendKeys("surendhar44");
		log.getLoginPassword().sendKeys("demo@321$");
		log.getLoginButton().click();
		wait(2000);
		boolean actualMessage = driver.getPageSource().contains("Welcome");
		String expectedMessage = "Welcome";
		Assert.assertTrue(actualMessage, expectedMessage);
		screenshot("Login");
	}

	@AfterTest
	public void quitBrowser() {
		tearDown();
	}
}
