package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {
	
	public static void main(String[] args) {
WebDriver driver;
        
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.gecko.driver", "D:\\Sophie\\JARS\\geckodriver.exe");
        
        //Instantiating driver object and launching browser
        driver = new FirefoxDriver();
        
        driver.get("http://www.gmail.com");
        //isDisplayed() method returns boolean value either True or False
Boolean Display = driver.findElement(By.xpath("//*[@id='identifierId']")).isDisplayed();
        //To print the value
System.out.println("Element displayed is :"+Display);
        //isEnabled() method returns boolean value either True or False 
Boolean Enable = driver.findElement(By.xpath("//*[@id='identifierId']")).isEnabled();
System.out.println("Element enabled is :"+Enable);
//Passing value as "softwaretestingmaterial" in the email field
driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("softwaretestingmaterial");
        //to click on next button
driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
//isSelected() method returns boolean value either True or False
Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();
System.out.println("Element selected is :"+Select);
	}

}
