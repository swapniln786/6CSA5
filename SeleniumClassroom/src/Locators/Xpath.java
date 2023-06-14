package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.cricbuzz.com/cricket-series/5246/t20-blast-2023/points-table");
//	driver.findElement(By.xpath("(//th[text()='South Group']/../../..//tr)[2]"));
//	driver.get("https://www.flipkart.com/poco-x5-5g-wildcat-blue-128-gb/p/itm6a8049291a98f?pid=MOBGNBFBPH6Q5ZN4&lid=LSTMOBGNBFBPH6Q5ZN4GHW78F&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=clp_banner_2_11.bannerX3.BANNER_mobile-phones-store_91XSIFXK8KOE&fm=neo%2Fmerchandising&iid=1a632e96-ee25-4f3f-8b59-45f62ae63ee2.MOBGNBFBPH6Q5ZN4.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=walb0ev3280000001686113537300");
//	driver.findElement(By.xpath("(//div[text()='₹'])[1]/..//div[@class='_30jeq3 _16Jk6d']"));
	driver.get("https://www.amazon.in/realme-Feather-Segment-Charging-Slimmest/dp/B0C45N5VPT/?_encoding=UTF8&_ref=dlx_gate_sd_dcl_tlt_71003da2_dt&pd_rd_w=7YpQ3&content-id=amzn1.sym.9e4ae409-2145-4395-aa6e-45d7f3e95c3e&pf_rd_p=9e4ae409-2145-4395-aa6e-45d7f3e95c3e&pf_rd_r=98E2MCB8SHQ1J59BN9Q4&pd_rd_wg=WryvA&pd_rd_r=3d025990-c110-465d-a860-6f29f5f88a92&ref_=pd_gw_unk");
	driver.findElement(By.xpath("//span[contains(text(),'M.R.P')]/../../../..//span[@class='a-price-whole']"));
	System.out.println("Element identified");
	driver.close();
}
}
