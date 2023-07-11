package OptimizingSearchCriteria;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchUsingTable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://irctc.com/contact.html");
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement tbody = table.findElement(By.tagName("tbody"));
	List<WebElement> allRows = tbody.findElements(By.tagName("tr"));
	for (WebElement tableRow : allRows) {
System.out.println(tableRow.findElement(By.tagName("a")).getAttribute("href"));
			}
	
}
}
