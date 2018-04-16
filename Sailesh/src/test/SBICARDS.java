package test;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class SBICARDS {
	
	WebDriver driver1;
	
	public void sailesh() throws Exception{
		
	
		
		// mouse hover
		
		Actions mousehover = new Actions(driver1);
		mousehover.moveToElement(driver1.findElement(By.linkText("Pay"))).build().perform();
		Thread.sleep(4000);
		//driver1.close();
		
		//window handles
		
		WebElement a = driver1.findElement(By.linkText("Register"));
		
	   a.click();
		//Set<String> value = driver1.getWindowHandles();
	   // String a = driver1.getWindowHandle();
		//driver1.findElement(By.linkText("View Payment Demo")).click();
	//	Set<String> value1 = driver1.getWindowHandles();
	//	System.out.println( value+"windowhandles");
		//System.out.println( value1+"windowhandles");
		//Thread.sleep(4000);
	//Object a[]= value.toArray();
//	driver1.switchTo().window(a[0].toString());
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	SBICARDS a = new SBICARDS();
	a.sailesh();

	}

}
