import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args)
	{
		System.getProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("Usernme")).sendKeys("BCD");
		driver.findElement(By.name("Pssword")).sendKeys("234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("Mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'value')]")).click();
		
	}

}
