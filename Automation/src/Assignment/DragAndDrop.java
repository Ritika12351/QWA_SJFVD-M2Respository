package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		// drag webelement
		WebElement drag = driver.findElement(By.xpath("//div[text()='Moblie Charger']"));
		// drop weebelement
		WebElement drop = driver.findElement(By.xpath("//div[text()='Moblie Accessories']"));
		driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		// drop weebelement
		driver.findElement(By.xpath("//div[text()='Moblie Accessories']"));
		driver.findElement(By.xpath("//div[text()='Mobile Cover']"));

		driver.findElement(By.xpath("//div[text()='Moblie Accessories']"));
		driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		// drop weebelement
		driver.findElement(By.xpath("//div[text()='Moblie Accessories']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();

	}

}
