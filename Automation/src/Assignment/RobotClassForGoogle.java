package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import KeyboardHandling.KeysEnum;

public class RobotClassForGoogle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("http://www.google.com");
		// create the object of Actions class
		Actions act = new Actions(driver);
		
		// use context click
		act.contextClick().perform();
		
       // create the object of roboat class
		Robot r = new Robot();
		for(int i=0; i<=9; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		

		

	}

}
