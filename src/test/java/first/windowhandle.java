package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowhandle {
		public static void main(String[] args) throws Exception {
			System.setProperty("Webdriver.edge.driver","C:\\User\\Ranjith\\eclipse-workspace\first\target\\driver\\msedgedriver.exe");
		 WebDriver d= new EdgeDriver();
		 String v="https://www.flipkart.com/";
		 d.navigate().to(v);
		 d.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 d.findElement(By.xpath("(//input[@class=\"Pke_EE\"])")).sendKeys("apple watch",Keys.ENTER);
		 
		 d.findElement(By.xpath("(//a[@class=\"IRpwTa _2-ICcC\"])[1]")).click();
		 
		 d.findElement(By.xpath("(//a[@class=\"IRpwTa _2-ICcC\"])[2]")).click();
		 
		 d.findElement(By.xpath("(//a[@class=\"IRpwTa _2-ICcC\"])[3]")).click();

		 String p= d.getWindowHandle();
		 Set<String> c = d.getWindowHandles();
		 List<String>li=new ArrayList<>(c);
		 d.switchTo().window(li.get(2));
		 
		 System.out.println(p);
		 System.out.println(c);
		 
		 
		 
		 
		 
		}
		 
}
