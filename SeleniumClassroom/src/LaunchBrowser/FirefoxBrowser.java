package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
public static void main(String[] args) {
	System.setProperty("webDriver.gecko.Driver","./geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
}
}
