package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption_MSD{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/nikam/OneDrive/Desktop/Dropdown.html");
		WebElement cities = driver.findElement(By.id("cities"));
		Select select=new Select(cities);
		select.selectByIndex(2);
		select.selectByValue("1");
		System.out.println(select.getFirstSelectedOption().getText());
	}
}
