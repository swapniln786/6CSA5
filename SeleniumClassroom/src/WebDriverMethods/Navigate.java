package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.quit();
	
	
}
}
