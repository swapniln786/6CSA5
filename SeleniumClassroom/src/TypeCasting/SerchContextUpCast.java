package TypeCasting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SerchContextUpCast {
public static void main(String[] args) {
	System.setProperty("webDriver.gecko.Driver","./geckodriver.exe");
	SearchContext driver=new FirefoxDriver();
}
}
