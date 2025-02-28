package seleniumTests;

import java.util.List;
import java.util.Map;

import PageObjects.LoginPageObjects;
import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTablesListStepDefinations {

	TestContext testContext;
	LoginPageObjects loginPage;

	public DataTablesListStepDefinations(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getloginPageObjs();
	}
	
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("I am on sauce demo Login page");
	    
	}

	@And("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable usercredentials) throws InterruptedException {
// Datatables as List
		List<List<String>> data = usercredentials.asLists();
//Printing the available list
		for(List<String> items: data) {
			System.out.println(items);
		}
//	By the use of list we can provide value one by one
		loginPage.getusernameTextbox(data.get(0).get(0));
		loginPage.getpasswordTextbox(data.get(0).get(1));
		loginPage.getLoginBtnClick();
		
    //DataTables as map		
//	Returns List of data in key, Value Pair
//		List<Map<String, String>>  data=usercredentials.asMaps(String.class, String.class);
//
//		for(Map<String,String> items :data) {
//			loginPage.clearusernameTextbox();
//			loginPage.getusernameTextbox(items.get("UserName"));
//			Thread.sleep(2000);
//			loginPage.cleargetpasswordTextbox();
//			loginPage.getpasswordTextbox(items.get("Password"));
//			Thread.sleep(2000);
//		}
		
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    System.out.println("I am good");
		testContext.getWebDriverManager().closeDriver();
	}
}
