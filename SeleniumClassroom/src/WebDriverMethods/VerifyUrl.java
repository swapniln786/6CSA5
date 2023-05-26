package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com/login/");
	String actualResult = driver.getCurrentUrl();
	String expectedResult="https://www.facebook.com/login/";
	if(actualResult.equals(expectedResult)) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	if(actualResult==expectedResult) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	
	
}
}
