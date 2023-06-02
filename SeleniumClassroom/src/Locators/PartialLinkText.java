package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1610559204%3A1685677808690474&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&ifkv=Af_xneET0jsiWqkRxVfTvQpikKnaIZKWzjTOVyYeANTnMlpMe6lsm320kzi2XvUXacgUlrmjd3PuZA&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.partialLinkText("Learn"));
	System.out.println("Element identified");
	driver.close();
}
}
