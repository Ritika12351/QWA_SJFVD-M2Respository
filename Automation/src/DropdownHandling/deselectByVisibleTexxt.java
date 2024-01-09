package DropdownHandling;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByVisibleTexxt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://demoapp.qspiders.com/dropdown/multiselect?sublist=1");
		// identify the multi-select dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		// create object of select class
		Select S = new Select(dropdown);
		S.selectByVisibleText("India");
		S.selectByVisibleText("canda");
		S.deselectByValue("united kingdom");
		Thread.sleep(2000);
		// deselect
		S.deselectByVisibleText("India");
		S.deselectByVisibleText("canda");
		S.deselectByVisibleText("united kingdom");
		Thread.sleep(3000);

	}

}
