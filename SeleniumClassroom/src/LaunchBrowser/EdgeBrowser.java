package LaunchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.Driver","./msedgedriver");
	EdgeDriver driver=new EdgeDriver();
}
}
