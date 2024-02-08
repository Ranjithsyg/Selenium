package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sample {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Ranjith\\eclipse-workspace\\first\\target\\driver\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    String s="https://www.google.co.in/";
    driver.get(s);
    
    driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium"+Keys.ENTER);
    System.out.println();
    






}
}
