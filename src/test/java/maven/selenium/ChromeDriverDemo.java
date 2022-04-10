package maven.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		//System.out.print(System.getProperty("user.dir"+"\\resources\\chromedriver.exe"));
		String chromPath=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromPath);
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");

	}

}
