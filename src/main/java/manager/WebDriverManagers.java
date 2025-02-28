package manager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ennums.DriverType;
import ennums.EnvironmentType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagers {
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType envType;;

	
	
	
	
	public WebDriverManagers() {
		driverType =FileManager.getInstance().getConfigReader().getBrowser();
		envType = FileManager.getInstance().getConfigReader().getEnvType();
	}
	
	public WebDriver getDriver() throws Throwable {
		if(driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	private WebDriver createDriver() throws Throwable {
		   switch (envType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
	

	private WebDriver createLocalDriver() throws Throwable {
        switch (driverType) {	    
        case FIREFOX : 
        	WebDriverManager.firefoxdriver().setup();
        	driver = new FirefoxDriver();
        	
        	
	    	break;
        case CHROME : 
        	WebDriverManager.chromedriver().setup();
        	ChromeOptions options = new ChromeOptions();
        	options.addArguments("disable-extensions");
        	options.addArguments("--incognito");
        	driver = new ChromeDriver(options);
        	
    		break;
    		
        case EDGE : 
        	WebDriverManager.edgedriver().setup();
        	EdgeOptions edoptions= new EdgeOptions();
        	edoptions.addArguments("disable-extensions");
			edoptions.addArguments("--disable-features=WebRtcHideLocalIpsWithMdns");
			edoptions.addArguments("--disable-gpu"); // Prevent GPU-related crashes
			edoptions.addArguments("--no-sandbox");  // Bypass OS security
			edoptions.addArguments("--disable-dev-shm-usage"); // Prevent shared memory issues
			edoptions.addArguments("--remote-allow-origins=*"); // Allow all remote origins
//        	edoptions.addArguments("-inprivate");
        	driver = new EdgeDriver(edoptions);
        	
    		break;
        }
        Thread.sleep(3000);
        driver.get(FileManager.getInstance().getConfigReader().getApplicationUrl());
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}	

	
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	
	


}
