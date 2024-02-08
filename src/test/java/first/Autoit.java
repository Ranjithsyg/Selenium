package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autoit {
	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.edge.driver","C:\\User\\Ranjith\\eclipse-workspace\first\target\\driver\\msedgedriver.exe");
	 WebDriver d= new EdgeDriver();
	 String v="https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw4P6oBhBsEiwAKYVkq080hBLj_HOrNRcDY1ko7OT9LT0bglYMbV8_6ch8bOmxlKHGiR31NxoCXawQAvD_BwE&gclsrc=aw.ds";
	 d.navigate().to(v);
	 d.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 
	 
	 d.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	 Thread.sleep(3000);
	 Runtime.getRuntime().exec("C:\\Users\\Ranjith\\Documents\\Fileup.exe");
	 
	 
}
}