package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions_SSD {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/nikam/OneDrive/Desktop/Dropdown.html");
	WebElement country = driver.findElement(By.id("country"));
	Select select=new Select(country);
	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	for(WebElement singleOption:allSelectedOptions)
		System.out.println(singleOption.getText());
}
}
