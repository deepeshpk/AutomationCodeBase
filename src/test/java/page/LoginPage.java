package page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

	// PageFactory - Object Repository
	
	@FindBy(id="userid")
	WebElement useridElement;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordElement;

	@FindBy(id="Submit")
	WebElement submit;
	
	@FindBy(xpath="//div[@id='errorText']")
	WebElement errorElement;

	// Initialize the page with web element
	public LoginPage() throws Exception {

		PageFactory.initElements(driver, this);
	}

	public HomePage login(String un, String pwd) throws Exception {
		
		return new HomePage();

	}
	
	public void sendusername(String username) {
		
		System.out.println("------------ " + username ) ;
		useridElement.sendKeys(username);
		
	}

	public void sendpassword(String password ) {
		
		passwordElement.sendKeys(password);
	}

	public void submit() {
		submit.click();
	}
	
	public boolean isErrorExists() throws InterruptedException {
		System.out.println("Welcome to Hpp.kasierpermanaente");
		Thread.sleep(10000);
		if (errorElement.isDisplayed()) {
			return true;
		}
		return false;
	}
}