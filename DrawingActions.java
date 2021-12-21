package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DrawingActions {

	WebDriver driver;
	public DrawingActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void drawLine(int x1, int y1, int x2, int y2) {
		WebElement drawButton = driver.findElement(By.xpath("//div[@class = 'toolbar']/input[@type='button' and contains(@class,'button line')]"));
		drawButton.click();
		
		WebElement drawingArea = driver.findElement(By.id("imageTemp"));
		Actions action = new Actions(driver);

		action.moveToElement(drawingArea, x1-300, y1-250).click();
		action.moveToElement(drawingArea, x2-300, y2-250).click().build().perform();	
	}
	
	public void drawRectangle(int x1, int y1, int x2, int y2) {
		WebElement drawButton = driver.findElement(By.xpath("//div[@class = 'toolbar']/input[@type='button' and contains(@class,'button rectangle')]"));
		drawButton.click();
		
		WebElement drawingArea = driver.findElement(By.id("imageTemp"));
		Actions action = new Actions(driver);

		action.moveToElement(drawingArea, x1-300, y1-250).click();
		action.moveToElement(drawingArea, x2-300, y2-250).click().build().perform();
		
	}
	
	public void deleteLine(int x1, int y1, int x2, int y2) {
		WebElement drawButton = driver.findElement(By.xpath("//div[@class = 'toolbar']/input[@type='button' and contains(@class,'button eraser')]"));
		drawButton.click();
		
		WebElement drawingArea = driver.findElement(By.id("imageTemp"));
		Actions action = new Actions(driver);

		action.moveToElement(drawingArea, x1-300, y1-250);
		action.clickAndHold();
		action.moveToElement(drawingArea, x2-300, y2-250).release().build().perform();
	}
}
