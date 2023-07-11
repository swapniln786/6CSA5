package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulationUsingSendkeys {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement username = driver.switchTo().activeElement();
	username.sendKeys("hsbfh");
	username.sendKeys(Keys.TAB+ "65454");
	WebElement password = driver.switchTo().activeElement();
	password.sendKeys(Keys.TAB+Keys.chord(Keys.TAB));
	driver.switchTo().activeElement().sendKeys(Keys.ENTER);
}
}
