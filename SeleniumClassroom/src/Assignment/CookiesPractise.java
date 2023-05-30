package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractise {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Set<Cookie> allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCooky:allCookies)
	System.out.println(singleCooky.getName());
	System.out.println("=================================");
	Cookie cooky1=new Cookie("selenium","10");
	Cookie cooky2=new Cookie("manual","7");
	Cookie cooky3=new Cookie("java","1");
	driver.manage().addCookie(cooky1);
	driver.manage().addCookie(cooky2);
	driver.manage().addCookie(cooky3);
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCooky:allCookies)
	System.out.println(singleCooky.getName());
	System.out.println("=================================");
	driver.manage().deleteCookieNamed("selenium");
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCooky:allCookies)
	System.out.println(singleCooky.getName());
	System.out.println("=================================");
	driver.manage().deleteCookie(cooky3);
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCooky:allCookies)
	System.out.println(singleCooky.getName());
	System.out.println("=================================");
	driver.manage().deleteAllCookies();
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCooky:allCookies)
	System.out.println(singleCooky.getName());
}
}
