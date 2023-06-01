package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.tagName("input"));
	System.out.println("Element 1 found");
	driver.get("https://www.google.com");
	driver.findElement(By.tagName("input"));
	System.out.println("Element 2 found");
	driver.get("https://www.amazon.com");
	driver.findElement(By.tagName("input"));
	System.out.println("Element 3 found");
	driver.get("https://www.flipkart.com");
	driver.findElement(By.tagName("input"));
	System.out.println("Element 4 found");
	driver.get("https://www.airtel.in/");
	driver.findElement(By.tagName("input"));
	System.out.println("Element 5 found");
	driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
	driver.findElement(By.tagName("button"));
	System.out.println("Element 6 found");
	driver.get("https://twitter.com/");
	driver.findElement(By.tagName("header"));
	System.out.println("Element 7 found");
	driver.get("https://www.wikipedia.org/");
	driver.findElement(By.tagName("p"));
	System.out.println("Element 8 found");
	driver.get("https://www.reddit.com/");
	driver.findElement(By.tagName("div"));
	System.out.println("Element 9 found");
	driver.get("https://store.steampowered.com/");
	driver.findElement(By.tagName("a"));
	System.out.println("Element 10 found");
}
}
