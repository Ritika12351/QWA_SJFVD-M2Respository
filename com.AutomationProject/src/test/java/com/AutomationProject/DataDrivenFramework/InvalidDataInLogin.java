package com.AutomationProject.DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidDataInLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Flib lib = new Flib();
		int row_count = lib.getRowCount("./src/test/resource/TestData.xlsx", "InValid");
		System.out.println(row_count);
		for (int i = 1; i <= row_count; i++) {
			String username = lib.getDataFromExcelSheet("./src/test/resource/TestData.xlsx", "Invalid", i, 0);
			String password = lib.getDataFromExcelSheet("./src/test/resource/TestData.xlsx", "Invalid", i, 1);
			System.out.println(password);
			WebElement username1 = driver.findElement(By.name("username"));
			
			username1.sendKeys(username);
			Thread.sleep(2000);
			WebElement password1 = driver.findElement(By.name("password"));
			password1.sendKeys(password);
			username1.clear();
			password1.clear();

		}

	}
}
