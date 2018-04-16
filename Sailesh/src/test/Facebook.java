package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook {

	
	public void chrome() throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1  = new ChromeDriver();
		driver1.get("https://www.facebook.com/?stype=lo&jlou=AfeVJaBNCTyiqOYxOC9sdx4uw9brivYOrc8S119_uPtFl_1FiQq_eqNPfslWCGxn2isz3kjGFb2OUlTqDewRvEFGRqQ514GKzyUrX8ApKi8MbQ&smuh=42896&lh=Ac-cFl3RPq4dyL3L");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		
	}
	
	public void firerfox(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.ca/");
		driver.close();
	}
	
	public void ie(){
		System.setProperty("webdriver.ie.driver","C:\\Library\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://www.google.ca/");

	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Facebook a = new Facebook();
a.chrome();
a.firerfox();
a.ie();




	}

}
