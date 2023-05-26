package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String actualResult=driver.getTitle();
	String expectedResult="actiTIME - Login";
	if(actualResult.equals(expectedResult))//use equals method as == compares references of object/string
	{
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
}
}
