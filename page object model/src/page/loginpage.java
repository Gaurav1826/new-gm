package page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class loginpage {

		// decleard
		@FindBy (xpath="//input[@id='user-name']") private WebElement un;
		@FindBy (xpath="//input[@id='password']")  private WebElement pwd;
		@FindBy(xpath="//input[@id='login-button']") private WebElement lgnBtn;
		
		// initialization
		public loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//usage
	 public void setloginPageUn()
	 {
		 un.sendKeys("standard_user");
	 }
	 
	 public void setloginPagePwd()
	 {
		 pwd.sendKeys("secret_sauce");
	 }
	 public void clickloginPagelgnBtn() {
	 lgnBtn.click();
	}

}
