package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.get("https://www.facebook.com/login/");
	driver.get("https://demo.actitime.com/login.do");
}
}
