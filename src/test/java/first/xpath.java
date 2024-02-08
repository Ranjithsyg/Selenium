package first;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpath {
	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.edge.driver","C:\\User\\Ranjith\\eclipse-workspace\first\target\\driver\\msedgedriver.exe");
	 WebDriver d= new EdgeDriver();
//	 String v="https://demoqa.com/alerts";
	 String v="https://www.flipkart.com/";
	 d.navigate().to(v);// alert java
	 d.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 
	 d.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]")).click();
     Alert a=d.switchTo().alert();
     a.accept();
     Thread.sleep(4000);
     
     d.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]")).click();
     Alert a1=d.switchTo().alert();
     a1.dismiss();
     Thread.sleep(4000);
     
     d.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[4]")).click();
     Alert a2=d.switchTo().alert();
     String t=a.getText();
     System.out.println(t);
     a2.accept();
     Thread.sleep(4000);
//Alert java
     
     
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 WebElement k =d.findElement (By.xpath("(//a[@class=\"button button-orange\"])[5]"));
//	 WebElement g=d.findElement(By.xpath("//ol[@id=\"bank\"]"));
//	 Actions a=new Actions(d);
//	 a.dragAndDrop(k, g).build().perform();
//	 Thread.sleep(3000);
//	 
//	 
//	 
//	 WebElement k1= d.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
//	 WebElement g1= d.findElement(By.id("amt7") );
//     Actions a1= new Actions(d);
//	 a1.dragAndDrop(k1, g1).build().perform();
//	 Thread.sleep(3000);
//	 
//	 WebElement k2=d.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
//	 WebElement g2=d.findElement(By.xpath("(//li[@class=\"placeholder\"]) [1]"));
//	 Actions a2= new Actions(d);
//	 a2.dragAndDrop(k2, g2).build().perform();
//	 Thread.sleep(3000);
//	 
	 
	 
//	 WebElement k1 =d.findElement (By.xpath("(//a[@class'button button-orange\'])[4])"));
//	 WebElement g1=d.findElement(By.xpath("(//li[@class='palceholder'])[1]"));
//	 Actions a1=new Actions(d);
//	 a1.dragAndDrop(k1, g1).build().perform();
//	 Thread.sleep(3000);
//	 
//	 WebElement k2 =d.findElement (By.xpath("(//a[@class='button button-orange'])[6])"));
//	 WebElement g2=d.findElement(By.xpath("(//li[@class='palceholder'])[1]"));
//	 Actions a2=new Actions(d);
//	 a2.dragAndDrop(k2, g2).build().perform();
//	 Thread.sleep(3000);
//	
//	 WebElement k3 =d.findElement (By.xpath("(//a[@class='button button-orange'])[2])"));
//	 WebElement g3=d.findElement(By.xpath("(//li[@class='palceholder'])[1]"));
//	 Actions a3=new Actions(d);
//	 a3.dragAndDrop(k3, g3).build().perform();
//	 Thread.sleep(3000);
//	
	 
	 
	 
	 
	 
	 
	}
	

}
