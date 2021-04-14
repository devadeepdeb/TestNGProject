package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void Setup() {
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	System.setProperty("webdriver.driver.gecko", "geckodriver.exe");
	
	
	driver = new ChromeDriver();
	// WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.simplilearn.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	
	}

	@Parameters({"username","password"})
	@Test
	public void Login(String Username, String Password) {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginMethod(Username, Password);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
