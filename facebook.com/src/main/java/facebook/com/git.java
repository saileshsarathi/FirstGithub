package facebook.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class git {
	
 WebDriver driver;

 public static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.ca/tosca-jobs-in-Mississauga,-ON");
		driver.findElement(By.linkText("TD Bank")).click();
		
		Set<String> ab = driver.getWindowHandles();
		Object b[] = ab.toArray();
		driver.switchTo().window(b[0].toString());
		System.out.println(b[0]);
		
		int i =10;
		//System.out.println(j);
	//	driver.switchTo().alert().accept();
		
		inheritance a = new inheritance();
		a.sai();
		
		//Mouse hover 
		
	/*	Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Book"))).build().perform();*/
		

	}

}
