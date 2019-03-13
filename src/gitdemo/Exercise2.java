package gitdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 {
	
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "D:\\Sophie\\JARS\\geckodriver.exe");
        
        //Instantiating driver object and launching browser
        driver = new FirefoxDriver();
        
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(int i=0;i<=links.size();i++)
        {
        	String linkname=links.get(i).getText();
        	System.out.println(linkname);
        }
        System.out.println(links.size());
	}

}
