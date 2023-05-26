package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	URL url=new URL("https://www.fb.com");//create object of URL class after importing
	driver.navigate().to(url);//pass url variable of object as argument
}
}
