package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class totakescreenshortForBluestone {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("http://www.bluestone.com/");

		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(3000);
		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
		// create the object of Actions class
		Actions act = new Actions(driver);

		// use context click
		act.moveToElement(coin).perform();
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();

		// explicit typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		// to use getscreenshort As method
		File src = ts.getScreenshotAs(OutputType.FILE);
		// create a new file and pass the path where you want to store your screenshort
		File dest = new File("./screenshort/Coins.png");
		// copy from src to dest
		Files.copy(src, dest);

	}

}
