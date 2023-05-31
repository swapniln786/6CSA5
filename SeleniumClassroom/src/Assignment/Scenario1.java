package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Set<Cookie> allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
	System.out.println("=========================================================");
	Cookie cooky=new Cookie("selenium", "7");
	driver.manage().addCookie(cooky);
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
	System.out.println("=========================================================");
	driver.manage().deleteCookie(cooky);
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
}
}
