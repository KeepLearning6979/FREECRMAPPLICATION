import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.getProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement elementCountry = driver.findElement(By.name("country"));
		Select dropDownSelect = new Select(elementCountry);
		dropDownSelect.selectByIndex(0);
		Thread.sleep(3000);
		dropDownSelect.selectByValue("ALGERIA");
		Thread.sleep(3000);
		dropDownSelect.selectByVisibleText("AMERICAN SAMOA");
		
		  List<WebElement> allText = dropDownSelect.getOptions(); 
		  for(WebElement options: allText )
		  { 
			  String s = options.getText(); 
			  System.out.println(s); 
			  }
		 
		
		String  fstSelected =  dropDownSelect.getFirstSelectedOption().getText();
		
		System.out.println(fstSelected);

	}

}
