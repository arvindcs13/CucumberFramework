package configFileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ennums.DriverType;
import ennums.EnvironmentType;

public class PeropertyFileReader {

	private Properties properties;
	private final String propertyFilePath = "C:\\\\Users\\\\Vijay\\\\naya-workspace\\\\AutomationFMWkArvind\\\\configs\\\\config.properties";

	public PeropertyFileReader() {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(propertyFilePath);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found ");
		}
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else
			throw new RuntimeException("url not specified in the Configuration.properties file. " + propertyFilePath);
	}

	public DriverType getBrowser() {
		String broswer_name = properties.getProperty("browser");
		if (broswer_name == null || broswer_name.equals("chrome")) {
			return DriverType.CHROME;
		}
		if (broswer_name.equals("firefox")) {
			return DriverType.FIREFOX;
		}
		if (broswer_name.equals("edge")) {
			return DriverType.EDGE;
		} else
			throw new RuntimeException(
					"Browser Type  not specified in the Config.properties file. " + propertyFilePath);
	}

	public EnvironmentType getEnvType() {
		String env_name = properties.getProperty("environment");
		if (env_name == null || env_name.equals("local")) {
			return EnvironmentType.LOCAL;
		}
		if (env_name.equals("remote")) {
			return EnvironmentType.REMOTE;
		} else {
			throw new RuntimeException("EnvType  not specified in the Config.properties file. " + propertyFilePath);
		}
		
		
	}
	
	
	public String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	

}
