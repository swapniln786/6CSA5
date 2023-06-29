package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S3 {
	public static void main(String[] args) throws IOException {
		Random r=new Random();
		int randomNumber = r.nextInt();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement password = driver.findElement(By.id("pass"));
		File temp = password.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./screenshots/screenshot"+randomNumber+".png");
		FileHandler.copy(temp, permanent);
		driver.close();
	}

}
