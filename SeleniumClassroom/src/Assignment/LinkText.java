package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.linkText("Gmail"));
	System.out.println("Element 1 identified");
	driver.get("https://www.google.co.in/");
	driver.findElement(By.linkText("Images"));
	System.out.println("Element 2 identified");
	driver.get("https://www.google.co.in/");
	driver.findElement(By.linkText("मराठी"));
	System.out.println("Element 3 identified");
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=2649986575402742945&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007785&hvtargid=kwd-32679660&hydadcr=14454_2316419");
	driver.findElement(By.linkText("Amazon Pay"));
	System.out.println("Element 4 identified");
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.linkText("Login"));
	System.out.println("Element 5 identified");
	driver.get("https://www.qspiders.com/");
	driver.findElement(By.linkText("2023"));
	System.out.println("Element 6 identified");
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("Forgot your password?"));
	System.out.println("Element 7 identified");
	driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMI-ZiM0tyj_wIVRWkrCh028AOvEAAYASAAEgKcefD_BwE");
	driver.findElement(By.linkText("Men"));
	System.out.println("Element 8 identified");
	driver.get("https://www.xbox.com/en-IN/");
	driver.findElement(By.linkText("Feedback"));
	System.out.println("Element 9 identified");  
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.linkText("BUSES"));
	System.out.println("Element 10 identified");
}
}
