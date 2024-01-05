package DropdownHandling;

import java.time.Duration;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		// identify the single-select dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		// create object of select class
		Select S = new Select(dropdown);
		List<WebElement> alloption = S.getOptions();
		for (WebElement option : alloption) {
			System.out.println(option.getText());

		}
	}
}
