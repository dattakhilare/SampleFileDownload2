package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadInputData {

	public Properties prop;

	public ReadInputData() {
		File fl = new File("InputVariables.properties");
		try {
			FileInputStream fs = new FileInputStream(fl);
			prop = new Properties();
			prop.load(fs);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getBaseUrl() {
		String baseUrl = prop.getProperty("BASE_URL");
		return baseUrl;
	}

	public String getChromeDriverLocation() {
		String chromeDriverLocation = prop.getProperty("CHROME_DRIVER_LOCATION");
		return chromeDriverLocation;
	}

	public String getDownloadLocation() {
		String downloadLocation = prop.getProperty("DOWNLOAD_LOCATION");
		return downloadLocation;
	}
}
