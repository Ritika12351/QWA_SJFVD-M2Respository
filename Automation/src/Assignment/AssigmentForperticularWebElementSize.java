package Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentForperticularWebElementSize {

	private static WebElement scollTill;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://www.zomato.com/india");
		WebElement scrollTill = driver.findElement(By.xpath("//p[text()='Work With Us"));
		Rectangle rec =scrollTill.getRect();
		int x=rec.getX();
		int y=rec.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("+x+", "+y+");
		

	}

}
