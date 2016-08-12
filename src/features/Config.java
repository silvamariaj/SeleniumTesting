package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Config {
	
	public static WebDriver driver;
	public static String urlOrigin;
	
	public static void driverDef(String browser) {
		
		if (browser.trim().toUpperCase() == "CHROME") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\msilva\\Downloads\\Programs\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			//pending
		}
				
	}
	
	public static void originDef(String env) {
		if (env.trim().toUpperCase() == "QA") {
			urlOrigin = "http://staffing-qa.nisumlatam.com:8080/#/";
		}
		driver.get(urlOrigin);
	}

}
