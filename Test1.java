package package1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get("https://google.com");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

}
