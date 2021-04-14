package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver;
	WebDriver driver1;

	@Test
	public void ChromeTest() {
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	System.setProperty("webdriver.driver.gecko", "geckodriver.exe");
	
	
	driver = new ChromeDriver();
	// WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.simplilearn.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	}
	
	@Test
	public void FirefoxTest() {
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	System.setProperty("webdriver.driver.gecko", "geckodriver.exe");
	
	
	//driver = new ChromeDriver();
	WebDriver driver1 = new FirefoxDriver();
	
	driver1.get("https://www.simplilearn.com/");
	
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	}
}
