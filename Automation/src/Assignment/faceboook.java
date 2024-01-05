package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceboook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lunch the browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//implicit wait
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    //lunch the application
			    driver.get("https://www.facebook.com/");

	}

}
