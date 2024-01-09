package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lunch the browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//implicit wait
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    //lunch the application
			    driver.get("file:///C:/Users/Admin/Desktop/Dropdown.html");
			    //identiy the dropdown
			    WebElement dropdown =driver.findElement(By.id("Dropdown"));
			    Select s=new Select(dropdown);
			   List<WebElement> allDuplicateOptions = s.getOptions();
			   TreeSet<String>Set=new TreeSet<String>();
			   for(int i=0; i<allDuplicateOptions.size();i++)
			   {
				   String allOptions=allDuplicateOptions.get(i).getText();
				   Set.add(allOptions);
			   }
			   for(String option:Set)
			   {
				   System.out.println(option);
			   }
			    


	}

}
