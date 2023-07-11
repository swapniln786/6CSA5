package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption_SSD {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/nikam/OneDrive/Desktop/Dropdown.html");
		WebElement country = driver.findElement(By.id("country"));
		Select select=new Select(country);
		select.selectByIndex(2);
		select.selectByIndex(4);
		System.out.println(select.getFirstSelectedOption().getText());
	}
}
