package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S2 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement password = driver.findElement(By.id("pass"));
	File temp = password.getScreenshotAs(OutputType.FILE);
	File permanent=new File("./screenshots/screenshot.png");
	FileHandler.copy(temp, permanent);	
}
}
