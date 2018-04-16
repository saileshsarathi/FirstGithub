package test;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saileshjunit {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
	}

	@Test
	public void test() throws Throwable {
		 
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeVJaBNCTyiqOYxOC9sdx4uw9brivYOrc8S119_uPtFl_1FiQq_eqNPfslWCGxn2isz3kjGFb2OUlTqDewRvEFGRqQ514GKzyUrX8ApKi8MbQ&smuh=42896&lh=Ac-cFl3RPq4dyL3L");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test 
	public void atest1(){
		driver.get("https://www.facebook.com/?");	
	driver.findElement(By.id("email")).sendKeys("sailesh.karthick@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("643364");
	driver.findElement(By.id("u_0_2")).click();
		
	}

}
