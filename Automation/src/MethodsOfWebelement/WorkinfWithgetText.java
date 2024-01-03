package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkinfWithgetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to open the application
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.id("login Button"));
		

	}

}
