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
	
	public  void name_username(String name)
	{
		//username.click();
		username.sendKeys(name);
	}
	
	public  void name_password(String pass)
	{
		//password.click();
		password.sendKeys(pass);
	}
	
	public  void name_login()
	{
		login.click();
	}
	
	
}
