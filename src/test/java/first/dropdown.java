package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.edge.driver","C:\\User\\Ranjith\\eclipse-workspace\first\target\\driver\\msedgedriver.exe");
		 WebDriver d= new EdgeDriver();
		 String v="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		 d.navigate().to(v);
		 d.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 
		 WebElement w=d.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[1]"));
		 Select r= new Select(w);
		 r.selectByIndex(2);
		 r.selectByValue("Apple");
		 r.selectByVisibleText("Google");
		 
		 List<WebElement> p1 = r.getOptions();
		 for(WebElement i:p1)
		 {
			 System.out.println(i.getText());
			 
		 }
		 System.out.println();
		 
		 for(int i=p1.size()-1;i>=0;i--){
		 WebElement j=p1.get(i);
		 System.out.println(j.getText());
		 }

	}

}
