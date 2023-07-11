package OptimizingSearchCriteria;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchUsingForm {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement parentElement = driver.findElement(By.tagName("form"));
	WebElement emailTextfield = parentElement.findElement(By.id("email"));
	emailTextfield.sendKeys("Selenium");
	WebElement passwordTextfield = parentElement.findElement(By.id("pass"));
	passwordTextfield.sendKeys("123456");
	WebElement loginButton = parentElement.findElement(By.name("login"));
	loginButton.click();
	driver.close();
	
	
	
	
}
}
