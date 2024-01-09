package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
				WebDriver driver = new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// lunch the application
				driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");

				// create the object of Actions class
				Actions act = new Actions(driver);
				//use context click method
			    act.contextClick(driver.findElement(By.id("btn20"))).perform();
			    act.contextClick(driver.findElement(By.id("btn21"))).perform();
			    Thread.sleep(3000);
			    //close the browser
			     driver.quit();

	}

}
