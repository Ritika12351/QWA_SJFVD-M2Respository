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

public class TakesscreenshotfornNetflix {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://www.netflix.com/in/");

		Thread.sleep(3000);
		
		WebElement netflix=driver.findElement(By.id("signIn"));
		Thread.sleep(3000);
		// create the object of Actions class
         Actions act = new Actions(driver);

         act.moveToElement(netflix).perform();
 			
		// to identify the username text field
		driver.findElement(By.className("Email or phone number")).sendKeys("savita@gmail.com");

		// to identify the password text field
		driver.findElement(By.name("password")).sendKeys("savita@123");

		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
		// explicit typecasting
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   // to use getscreenshort As method
		File src = ts.getScreenshotAs(OutputType.FILE);
		// create a new file and pass the path where you want to store your screenshort
		File dest = new File("./screenshort/netflix.png");
		// copy from src to dest
		Files.copy(src, dest);

			}
	}


