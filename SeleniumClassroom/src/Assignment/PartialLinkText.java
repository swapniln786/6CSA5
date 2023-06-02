package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.partialLinkText("ASK"));
	System.out.println("Element 1 identified");
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.partialLinkText("PROMOTIO"));
	System.out.println("Element 2 identified");
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Apparel"));
	System.out.println("Element 3 identified");
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.partialLinkText("Forgot"));
	System.out.println("Element 4 identified");
	driver.get("https://store.steampowered.com/");
	driver.findElement(By.partialLinkText("Install"));
	System.out.println("Element 5 identified");
	driver.get("https://store.steampowered.com/");
	driver.findElement(By.partialLinkText("Install"));
	System.out.println("Element 6 identified");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Create"));
	System.out.println("Element 7 identified");
	driver.get("https://www.zomato.com/india");
	driver.findElement(By.partialLinkText("restaurant"));
	System.out.println("Element 8 identified");
	driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMIhLGSk-mj_wIV2ZpmAh06gAsCEAAYASAAEgIL6vD_BwE");
	driver.findElement(By.partialLinkText("Home"));
	System.out.println("Element 9 identified");
	driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=perf_food_nu_google_search_sok_narm_brand_v1_v2_march23_brand_em&gclid=EAIaIQobChMI48OK3Omj_wIVoZJmAh1WggI7EAAYASAAEgKLSfD_BwE");
	driver.findElement(By.partialLinkText("Refund"));
	System.out.println("Element 10 identified");
	driver.close();
	
	
	
	
}
}
