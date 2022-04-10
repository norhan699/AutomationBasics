package maven.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo {

	public static void main(String[] args) {
		String firefoxPath=System.getProperty("user.dir")+"\\resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",firefoxPath);
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.google.com");

	}

}
