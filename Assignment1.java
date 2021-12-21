package package1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import package1.DrawingActions;

public class Assignment1 {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "http://www.htmlcanvasstudio.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseURL);
		DrawingActions draw1 = new DrawingActions(driver); 
		draw1.drawLine(200, 200, 400, 200);
		draw1.drawLine(300, 100, 300, 300);
		draw1.drawRectangle(200, 325, 400, 425);
		draw1.deleteLine(200, 200, 400, 200);	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(7000);
		driver.quit();
	}
}