package OptimizingSearchCriteria;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInsideDiv {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement parentDiv = driver.findElement(By.className("desktop-navLinks"));
	List<WebElement> allMenuOptions = parentDiv.findElements(By.className("desktop-navContent"));
	for (WebElement singleOption : allMenuOptions) {
		System.out.println(singleOption.findElement(By.tagName("a")).getText());
	}
}
}
