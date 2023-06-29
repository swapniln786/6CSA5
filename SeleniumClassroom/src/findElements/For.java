package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(allRadioButtons.size());
	for(int i=0;i<allRadioButtons.size();i++) {
		allRadioButtons.get(i).click();
		Thread.sleep(1000);
	}
	
}
}
