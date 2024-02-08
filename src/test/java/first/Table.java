package first;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.edgedrive.driver", "C:\\Users\\Ranjith\\eclipse-workspace\\first\\target\\driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		String s="https://tablepress.org/demo/";
		driver.get(s);
		
		
		 List<WebElement> t= driver.findElements(By.xpath("//table[@id=\"tablepress-demo\"]"));
		for(int i=0; i<t.size();i++) {
			WebElement t1 = t.get(i);
			WebElement tbody = t1.findElement(By.xpath("//tbody[@class=\"row-hover\"]"));
			List<WebElement> trows = tbody.findElements(By.tagName("tr"));
			for (int j=0; j<trows.size();j++)
			{
				WebElement tr = trows.get(j);
				List<WebElement> td = tr.findElements(By.tagName("td"));
				for(int k=0;k<td.size();k++) {
					WebElement td1 = td.get(i);
					String text= td1.getText();
					System.out.println(text);
					
				}
			}
			
		}
		
		
		
		
		
		
	}

}
