package Assignment;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class UserInputBrowser {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	WebDriver driver = null;
	System.out.println("Enter 1-Chrome Browser,2-Edge Browser");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:{
		driver=new ChromeDriver();
	}break;
	case 2:{
		driver=new EdgeDriver();
	}
	default:{
		System.out.println("Wrong Choice");
	}
	}
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
	driver.close();
}
}
