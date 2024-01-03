package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkinfWithgetsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://qspwakad/login.do");

		WebElement username = driver.findElement(By.name("username"));

		Dimension size = username.getSize();

		System.out.println(size);
		
	


	}

}
