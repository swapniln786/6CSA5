package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	Set<Cookie> allCookies = driver.manage().getCookies();
	for(Cookie singleCooky:allCookies)
	System.out.println(singleCooky.getName());
	
	
	
	
}
}
