package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformDisabledWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		//click on disbled buttan
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeAsyncScript("document.getElementById('name').value='ritika vaggu'");
		Thread.sleep(2000);
		js.executeAsyncScript("document.getElementById('email').value='ritikavaggu@gmail.com'");
		Thread.sleep(2000);
		js.executeAsyncScript("document.getElementById('password').value='ritika@123'");
		//identify the disabled button
		Thread.sleep(2000);
		WebElement disabledButton = driver.findElement(By.xpath("//button[text()='Register']"));
		js.executeScript("arguments[0].click()",disabledButton);
	}

}
