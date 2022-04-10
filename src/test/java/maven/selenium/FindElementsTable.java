package maven.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsTable {
	String chromePath= System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
	WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", chromePath);
		  driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/tables");
		  } 
		  @Test
		  public void tableElements() {
			  WebElement table = driver.findElement(By.id("table1"));
			  List<WebElement> rows = table.findElements(By.tagName("tr"));
			  System.out.println(rows.size());
			  System.out.println(rows.get(2));
			  System.out.println(rows.get(2).getText());
			  
		  }
	 

	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }

}
