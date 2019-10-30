package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver;
	
	public PageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText="SignIn")
	public static WebElement signin;
	
	@FindBy(name="userName")
	public static WebElement username;
	
	
	@FindBy(name="password")
	public static WebElement password;
		
	@FindBy(name="Login")
	public static WebElement login;
		
	public  void link_sigin()
	{
		signin.click();
	}
	
	public  void name_username()
	{
		//username.click();
		username.sendKeys("lalitha");
	}
	
	public  void name_password()
	{
		//password.click();
		password.sendKeys("Password123");
	}
	
	public  void name_login()
	{
		login.click();
	}
	
	
}
