import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickRightClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C://Users//USER//Desktop//CHROME//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * driver.manage().window().maximize(); Actions act = new Actions(driver);
		 * WebElement elementLocator =
		 * driver.findElement(By.linkText("Forgotten password?"));
		 * act.doubleClick(elementLocator).build().perform(); Thread.sleep(2000);
		 * WebElement rightclick = driver.findElement(By.id("identify_email"));
		 * act.contextClick(rightclick).build().perform(); Thread.sleep(2000);
		 * driver.navigate().to("https://www.amazon.in/"); driver.navigate().back();
		 * Thread.sleep(2000); driver.navigate().forward(); Thread.sleep(2000);
		 * driver.navigate().refresh();
		 */
		
		
		
		

	}

}
