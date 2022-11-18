package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	   //declearation
		@FindBy  (xpath="//div[@class='login_logo']") private WebElement logo;
		
		//initialization
		public Homepage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		
		}
		
		//usage
		public void verifyHomePageLogo()
		{
			boolean res=logo.isDisplayed();
			if(res==true)
			{
				System.out.println("logo is visible");
				
			}
			else
				System.out.println("logo is not visible");
		}
}
