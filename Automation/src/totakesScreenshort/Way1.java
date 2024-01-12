package totakesScreenshort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lunch the application
		driver.get("http://www.apple.com/in/iphone/");
		//explicit typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//to use getscreenshort As method
		File src= ts.getScreenshotAs(OutputType.FILE);
		//create a new file and pass the path where you want to store your screenshort
		File dest=new File("./screenshort/iphone.png");
        //copy from src to dest
		Files.copy(src, dest);
	}

}
