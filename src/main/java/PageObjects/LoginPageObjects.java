package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	
	
	private WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement usernameTextbox;
	
	public void getusernameTextbox(String username) {
		usernameTextbox.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTextbox;
	
	public void getpasswordTextbox(String password) {
		passwordTextbox.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBTn;
	
	public void getLoginBtnClick() {
		loginBTn.click();
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement usernameClear;
	
	public void clearusernameTextbox() {
		usernameClear.clear();
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordclear;
	
	public void cleargetpasswordTextbox() {
		passwordclear.clear();
	}
	
}
