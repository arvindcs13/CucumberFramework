package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomaPageObjects {

public HomaPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}


@FindBy(how=How.XPATH, using="//div[@class='app_logo']" )
private WebElement app_logo;

public void app_logoisDisplayed() {
	app_logo.isDisplayed();
}


@FindBy(how=How.XPATH, using="//div[@class='product_label']")
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