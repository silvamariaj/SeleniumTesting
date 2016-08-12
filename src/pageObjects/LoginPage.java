package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public final class LoginPage {
	
	private static WebDriver driver;
	private static WebElement username;
	private static WebElement password;
	private static WebElement signButton;
	//private static WebElement forgetPassword;
	
	public static void initialization(WebDriver dr) {
		driver = dr;
		username = driver.findElement(By.id("username"));
		password = driver.findElement(By.id("password"));
		signButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/button"));
		//forgetPassword = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/a"));
	}
	
	public static String loginSuccess(String user, String passw) {
		username.click();
		username.clear();
		username.sendKeys(user);
		password.click();
		password.clear();
		password.sendKeys(passw);
		signButton.click();
		return "Login Success";
	}

	public static String loginFail(String user, String passw) {
		username.click();
		username.clear();
		username.sendKeys(user);
		password.click();
		password.clear();
		password.sendKeys(passw);
		signButton.click();
		return "Login Fail";
	}

	

}
