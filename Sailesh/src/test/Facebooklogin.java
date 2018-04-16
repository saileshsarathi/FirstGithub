package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	
	
public void sailesh(){
	
	System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("sailesh.karthick@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("643364");
	driver.findElement(By.id("u_0_2")).click();
	driver.manage().window().maximize();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Facebooklogin a = new Facebooklogin();
a.sailesh();

	}

}
