package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelocity {
	
	WebDriver driver;
	
	public void login() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
		 driver  = new ChromeDriver();
		driver.get("https://www.hotwire.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("destination")).sendKeys("Chennai (and vicinity), India");
	}
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
Travelocity a = new Travelocity();
a.login();
	}

}
