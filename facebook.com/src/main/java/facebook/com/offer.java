package facebook.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class offer {

	WebDriver driver;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://cognextech.com/");
Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.linkText("IT Course"))).build().perform();
System.out.println("Hello15");
	}

}
