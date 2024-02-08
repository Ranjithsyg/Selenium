package first;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openbrowser {
	public static void main(String[] args) throws Exception  {
//		System.setProperty("Webdriver.edge.driver","C:\\User\\Ranjith\\eclipse-workspace\first\target\\driver\\msedgedriver.exe");
	WebDriverManager.edgedriver().setup();
		WebDriver d= new EdgeDriver();//upcasting
		String v ="https://www.dundaslife.com/";
//		d.get(v);
		d.navigate().to(v);
	d.manage().window().maximize();
	Thread.sleep(2000);
//	d.manage().window().minimize();
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	Thread.sleep(2000);
	d.navigate().refresh();

//	d.switchTo().newWindow(WindowType.TAB);
	String cr=d.getCurrentUrl();
	System.out.println(cr);
	
	if(v.equals(cr))
	{
		System.out.println("Given URL same");
	}
	else
	{
		System.out.println("Given URL not same");
	}
	String t = d.getTitle();
	System.out.println(t);
//	d.close();
//	d.quit();`
	}
}
