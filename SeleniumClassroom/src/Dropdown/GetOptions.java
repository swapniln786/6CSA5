package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/nikam/OneDrive/Desktop/Dropdown.html");
	WebElement cities = driver.findElement(By.id("cities"));
	Select select=new Select(cities);
	List<WebElement> allOptions = select.getOptions();
	for(WebElement  singleOption:allOptions) {
		if(singleOption.getText().equals("Delhi")) {
		singleOption.click();
		System.exit(0);
		}}
	
			System.out.println("Options not available");
		
	
}
}
