package pompackage;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest implements IAutoConstant{
	private static final long TIMESECONDS = 0;
	static WebDriver driver;
	public Object tearDown;
	public void setup() throws IOException {
		Flib lib =new Flib();
		String browser=lib.getDataFromProperty("PROPPATH","Browser ");
		String Url=lib.getDataFromProperty("PROPPTH","Url");
		//runtime;
		if(browser.equals("chome"))
		{driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		}
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Invalid browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(Url);

	}
	

	
	
	
	
	
	
	
	
	
	
	
	


	public void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}}
