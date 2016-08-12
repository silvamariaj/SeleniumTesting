import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import features.Config;
import pageObjects.LoginPage;

public class Sample {
    
	static WebDriver driver;
	static String urlOrigin = "http://staffing-qa.nisumlatam.com:8080/#/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msilva\\Downloads\\Programs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		LoginPage.initialization(driver);
		
		System.out.println(LoginPage.loginSuccess("admin", "admin"));
		

	}

	/*	Primeras pruebas	
	
	driver.findElement(By.id("username"));
	driver.findElement(By.id("username")).click();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.id("password")).click();
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("admin");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/button")).click();
	
	Thread.sleep(100); //It pauses for the time specified in parameter (milliseconds)
	
	
	
	//driver.close();
*/	
	
	
}
