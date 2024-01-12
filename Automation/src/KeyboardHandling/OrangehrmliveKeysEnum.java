package KeyboardHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmliveKeysEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//identify username and pass the value
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);


}


	}


