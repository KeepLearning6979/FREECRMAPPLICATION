import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUplod {

	public static void main(String[] args)
	{
		System.getProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\USER\\Desktop\\Jir.txt");
		

	}

}
