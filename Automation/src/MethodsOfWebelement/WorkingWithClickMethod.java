package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to open the application
		driver.get("https://www.airvistara.com/in/en");

		WebElement cookies = driver.findElement(By.xpath("//button[contains(text(),'Accept All')]"));

		cookies.click();

	}

}
