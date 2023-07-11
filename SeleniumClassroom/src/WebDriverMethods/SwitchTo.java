package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(1000);
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(3000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	//driver.quit();	
}
}
