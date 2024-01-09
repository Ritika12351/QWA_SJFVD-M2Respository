package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lunch the browser
				WebDriver driver = new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// lunch the application
				driver.get("https://www.flipkart.com/");
				// create the object of Actions class
				Actions act = new Actions(driver);
				
				// use context click
				act.contextClick().perform();

			}
	

}
