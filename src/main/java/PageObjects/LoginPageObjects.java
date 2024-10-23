package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	
	
	public LoginPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='user-name']")
	private WebElement usernameTextbox;
	
	public void getusernameTextbox(String username) {
		usernameTextbox.sendKeys(username);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	private WebElement passwordTextbox;
	
	public void getpasswordTextbox(String password) {
		passwordTextbox.sendKeys(password);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='login-button']")
	private WebElement loginBTn;
	
	public void getLoginBtnClick() {
		loginBTn.click();
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='user-name']")
	private WebElement usernameClear;
	
	public void clearusernameTextbox() {
		usernameClear.clear();
	}
	
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	private WebElement passwordclear;
	
	public void cleargetpasswordTextbox() {
		passwordclear.clear();
	}
	
}
