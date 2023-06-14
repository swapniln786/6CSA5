package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=5510250154199586098&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303268&hvtargid=kwd-32679660&hydadcr=14454_2316419");
	WebElement textbox1 = driver.findElement(By.id("twotabsearchtextbox"));
	textbox1.click();
	driver.get("https://www.flipkart.com/mobile-phones-bsd-june-aj83n-nou87-store?fm=neo%2Fmerchandising&iid=M_6bf0549b-16d4-47bc-8bed-ef7613ba7f0c_1_6LEPZLPGAN32_MC.BYIXDBQAWBHQ&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles%2B%2526%2BTablets_BYIXDBQAWBHQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=BYIXDBQAWBHQ");
	WebElement login = driver.findElement(By.linkText("Login"));
	Thread.sleep(3000);
	login.click();
	driver.get("https://demo.actitime.com/login.do");
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Thread.sleep(3000);
	password.click();
	driver.get("https://www.fb.com");
	WebElement password1 = driver.findElement(By.id("passContainer"));
	Thread.sleep(3000);
	password1.click();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement link = driver.findElement(By.partialLinkText("Computers"));
	Thread.sleep(3000);
	link.click();
	driver.get("https://www.youtube.com/");
	WebElement gaming = driver.findElement(By.linkText("Gaming"));
	Thread.sleep(3000);
	gaming.click();
	driver.get("https://www.google.co.in/");
	WebElement hindi = driver.findElement(By.linkText("हिन्दी"));
	Thread.sleep(3000);
	hindi.click();
	driver.get("https://github.com/");
	WebElement signin = driver.findElement(By.xpath("//input[@placeholder='Search GitHub']"));
	Thread.sleep(3000);
	signin.click();
	driver.get("https://open.spotify.com/");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Log in']"));
	Thread.sleep(3000);
	signup.click();
	driver.get("https://www.zee5.com/");
	WebElement signin1 = driver.findElement(By.id("searchInput"));
	Thread.sleep(3000);
	signin1.click();
	
	
	
	
}
}
