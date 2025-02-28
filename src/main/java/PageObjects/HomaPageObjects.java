package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomaPageObjects {

//	private final WebDriver driver;

	public HomaPageObjects(WebDriver driver) {
//		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


@FindBy(xpath="//div[@class='app_logo']" )
private WebElement app_logo;

public void app_logoisDisplayed() {
	app_logo.isDisplayed();
}


@FindBy(xpath="//div[@class='product_label']")
private WebElement product_Label;
public boolean product_LabelisDisplayed() {
	return product_Label.isDisplayed();
}


@FindBy(how=How.XPATH, using="//div[text()='Sauce Labs Backpack']")
private WebElement bagPack;

public WebElement bagPackisAvaialble() {
	return bagPack;
}

}