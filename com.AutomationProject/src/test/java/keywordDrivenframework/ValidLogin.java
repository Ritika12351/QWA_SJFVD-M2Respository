package keywordDrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest {

	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		BaseTest test=new BaseTest();
		test.setup();
		Flib lib=new Flib();
	
		String username=lib.getDataFromProperty(PATH,"Username");
		String password=lib.getDataFromProperty(PATH,"Password");
		test.driver.findElement(By.name("username")).sendKeys(username);

		test.driver.findElement(By.name("pwd")).sendKeys(username);

		test.driver.findElement(By.id("loginButton")).sendKeys(username);
		Thread.sleep(2000);
		test.tearDown();
		
				
		
		

	}

}
