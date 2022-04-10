package maven.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo2TestNG {
	String chromePath= System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
	WebDriver driver;
  @Test(priority=1,enabled=false)
  public void userCanLogin() {
	  System.out.println(driver.getCurrentUrl());
  }
  @Test(priority=2)
  public void userPageTitle() {
	  System.out.println(driver.getTitle());
  }
  @Test(groups = "reg")
  public void usergroup1() {
	  System.out.println(driver.getTitle());
  }
  @Test(groups = "reg")
  public void usergroup2() {
	  System.out.println(driver.getTitle());
  }
  @Test(groups = "regression")
  public void usergroup3() {
	  System.out.println(driver.getTitle());
  }
  
  @BeforeTest(groups = "reg")
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
  }

  @AfterTest(groups = "reg")
  public void afterTest() {
	  driver.quit();
  }

}
