import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxMinDeleteAllCookies {

	public static void main(String[] args)
	{
		System.getProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

	}

}
