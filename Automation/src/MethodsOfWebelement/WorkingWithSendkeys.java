package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch the webapplication
		driver.get("http://qspwakad/login.do");

		// identify username and pass the value
		driver.findElement(By.name("username")).sendKeys("admin");

		

	}

}
