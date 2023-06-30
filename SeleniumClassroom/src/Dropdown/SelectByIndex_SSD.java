package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex_SSD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/nikam/OneDrive/Desktop/Dropdown.html");
		WebElement degree = driver.findElement(By.id("degree"));
		Select select=new Select(degree);
		Thread.sleep(3000);
		select.selectByIndex(3);
		driver.close();
	}
}
