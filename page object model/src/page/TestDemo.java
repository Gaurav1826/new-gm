package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
      loginpage l=new loginpage(driver);
	l. setloginPageUn();
	l. setloginPagePwd();
    l.clickloginPagelgnBtn();
    
    Homepage h= new Homepage(driver);
    h.verifyHomePageLogo();
	
	
	}}
