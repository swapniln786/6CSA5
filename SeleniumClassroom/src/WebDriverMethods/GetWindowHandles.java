package WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getWindowHandle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getWindowHandle());
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getWindowHandle());
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println(allWinId);
		for (String Wid : allWinId) {
			System.out.println(Wid);
		}
	}
}
