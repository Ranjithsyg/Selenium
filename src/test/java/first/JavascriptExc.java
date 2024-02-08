package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptExc {
	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.edge.driver","C:\\User\\Ranjith\\eclipse-workspace\first\target\\driver\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement user=d.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
		WebElement login=d.findElement(By.xpath("//button[@type='submit']"));
		WebElement down=d.findElement(By.xpath("//a[text()='Careers']"));
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('value','ranjithyg@gmail.com')", user,login);
		
		Object j =js.executeScript("return arguments[0].getAttribute('value')", user,login);
		System.out.println(j);
		
		js.executeScript("arguments[1].click()", user,login);
//		js.executeScript("arguments[0].scrollIntoView(true)",down);
//	    
//		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red')", user,login);
//		
//		

		

		 
		 
		 
		 
		 
		 
		 
	}}
//		 String v="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
//		 d.navigate().to(v);
//		 d.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//		 d.manage().window().maximize();
//		 Thread.sleep(3000);
//	
//	     d.switchTo().frame("frame1");
//	     d.switchTo().frame("frame3");
//	     d.findElement(By.xpath("(//input[@id=\"a\"])")).click();
//	     d.switchTo().parentFrame();
//	     WebElement e = d.findElement(By.xpath("(//b[@id='topic'])"));
//	     System.out.println(e.getText());
//	     d.switchTo().defaultContent();
//	     System.out.println(d.findElement(By.xpath("((//li[@class=\"breadcrumb-item active update\"])")).getText());
//	     
//	}
//}
