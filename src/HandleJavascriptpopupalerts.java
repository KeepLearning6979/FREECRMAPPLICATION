import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavascriptpopupalerts {

	public static void main(String[] args) {
		System.getProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
	Alert alert=	driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	if(text.equals("Please enter a valid user name"))
	{
		System.out.println("Text is correct");
	}
	else
	{
		System.out.println("Text is incorrect");
	}
	alert.accept();
	driver.quit();

}
}
