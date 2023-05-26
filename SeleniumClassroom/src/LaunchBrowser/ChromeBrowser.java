package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.Driver","./chromedriver");
	ChromeDriver driver=new ChromeDriver();
	
}
}
