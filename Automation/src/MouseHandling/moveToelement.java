package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class moveToelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lunch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //lunch the application
	    driver.get("https://www.flipkart.com/");
	    WebElement fashion=driver.findElement(By.xpath("//span[text()='fashion']"));
	    //create the object of action class
	   Actions act= new Actions(driver);
	   //use move to element method
	   act.moveToElement(fashion).perform();
	   //close the browser
	   driver.quit();
	    

	}

}
