package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigmentfordemoapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");
		// create the object of Actions class
		Actions act = new Actions(driver);
		// use context click method
		act.contextClick(driver.findElement(By.id("btn30"))).perform();
		Thread.sleep(3000);
		act.contextClick(driver.findElement(By.xpath("//div[text()='Yes']"))).perform();

		act.contextClick(driver.findElement(By.id("btn31"))).perform();
		Thread.sleep(3000);
		act.contextClick(driver.findElement(By.xpath("//div[text()='Yes']"))).perform();

		act.contextClick(driver.findElement(By.id("btn32"))).perform();
		Thread.sleep(3000);
		act.contextClick(driver.findElement(By.xpath("//div[text()='1']"))).perform();

	}

}
