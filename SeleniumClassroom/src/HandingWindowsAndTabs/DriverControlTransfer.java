package HandingWindowsAndTabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverControlTransfer {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.WINDOW.TAB);
	driver.get("https://www.instagram.com/");
	driver.switchTo().newWindow(WindowType.WINDOW.WINDOW);
	driver.get("https://www.youtube.com/");
	Set<String> allWId = driver.getWindowHandles();
	for (String wId : allWId) {
		String windowUrl = driver.switchTo().window(wId).getCurrentUrl();
		if(windowUrl.equals("https://www.facebook.com/")) {
			driver.findElement(By.name("login")).click();
		}else if (windowUrl.equals("https://www.instagram.com/")) {
			driver.close();
		}else if (windowUrl.equals("https://www.youtube.com/")) {
			driver.manage().window().minimize();
		}
	}
}
}
