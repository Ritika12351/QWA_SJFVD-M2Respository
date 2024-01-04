package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lunch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //lunch the application
	    WebElement dropdown=driver.findElement(By.id("select3"));
	    //create object of select class
	    Select S =new Select(dropdown);
	    //using select by visibletext
	    S.selectByVisibleText("poland");

}
}
