package Assignment;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowser {
	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		Dimension d=new Dimension(750,800);
		driver1.manage().window().setSize(d);
		WebDriver driver2=new EdgeDriver();
		Dimension d1=new Dimension(750,800);
		driver2.manage().window().setSize(d1);
		Point p=new Point(750, 10);
		driver2.manage().window().setPosition(p);
		driver1.close();
		driver2.close();
	}
}
