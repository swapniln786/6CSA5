package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Dimension d=new Dimension(800,800);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}
}
