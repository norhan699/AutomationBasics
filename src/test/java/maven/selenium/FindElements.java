package maven.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElements {
	String chromePath= System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
	WebDriver driver;
	String LinkArr[];
	int i=0;
	
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", chromePath);
		  driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/");
		  LinkArr=new String[100];
		  } 
	  @Test
	  public void teatFindElements() {
		  //WebElement table = driver.findElement(By.id("table1"));
		  //get all the elements displayed on the page
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  //verify that there are 46 links displayed on the page
		  //System.out.println(links.size());
		  Assert.assertEquals(46, links.size());
		  //////////////////Expected,Actual
		  //Find Each link value
		  for (WebElement link : links) {
			  LinkArr[i]=link.getAttribute("href");
			System.out.println(link.getAttribute("href"));
			i++;
			/*driver.navigate().to(link.getAttribute("href"));
			driver.navigate().back();*/
			/*try {
				driver.wait(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		  for (String link : LinkArr) {
			  driver.navigate().to(link);
			  
			
		}
		
		  
	  }
	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }

}
