package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.youtube.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(3000);
	driver.quit();	
}
}
