package Windowhandaling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windownHandle {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iphone 14 (midnight,128 GB)')]")).click();
		//it will give the parent window id
		 String _parent_window_id = driver.getWindowHandle();
		
		System.out.println("parent window id is :"+_parent_window_id);
		//it will give the parent as well ass childe window id
		Set<String> all_id = driver.getWindowHandles();
		System.out.println("all id is:"+all_id);

}
}
