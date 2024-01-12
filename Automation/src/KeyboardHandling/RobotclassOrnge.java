package KeyboardHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotclassOrnge {

	public static void main(String[] args) throws AWTException {
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
				driver.findElement(By.name("username")).sendKeys("Admin");
                 Robot r=new Robot();
				//pressing the key
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_A);
                //releasing the key
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_A);
				
				r.keyPress(KeyEvent.VK_TAB);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
   
			
				

	}

}
