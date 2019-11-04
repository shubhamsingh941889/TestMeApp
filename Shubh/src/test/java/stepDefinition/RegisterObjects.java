package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RegisterObjects {
	
WebDriver driver;
	
	public RegisterObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="SignUp")
	public static WebElement signup;
	
	@FindBy(name="userName")
	public static WebElement username;
	
	@FindBy(name="firstName")
	public static WebElement firstname;
	
	@FindBy(name="lastName")
	public static WebElement lastname;

	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="confirmPassword")
	public static WebElement confirmpass;
	
	@FindBy(xpath="/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[1]"  )
	public static WebElement male;
	
	@FindBy(xpath="/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[2]")
	public static WebElement female;
	
	@FindBy(name="emailAddress")
	public static WebElement email;
	
	@FindBy(name="mobileNumber")
	public static WebElement mobile;
	
	@FindBy(name="dob")
	public static WebElement dob;
	
	@FindBy(name="address")
	public static WebElement address;
	
	@FindBy(name="securityQuestion")
	public static WebElement security;
	
	@FindBy(name="answer")
	public static WebElement answer;
		
	@FindBy(name="Submit")
	public static WebElement submit;
		
	public  void link_signup()
	{
		signup.click();
	}
	
	public void username(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void lastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void confirmpass(String cpass)
	{
		confirmpass.sendKeys(cpass);
	}
	
	public void mobileno(String mno)
	{
		mobile.sendKeys(mno);
	}
	
	public void genmale()
	{
		male.click();
	}	
	
	public void genfemale()
	{
		female.click();
	}
	
	public void emailid(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void date(String value)
	{
		dob.sendKeys(value);
	}
	
	public void address(String add)
	{
		address.sendKeys(add);
	}
	
	public void security()
	{
		security.click();
	}
	
	public void answer(String ans)
	{
		answer.sendKeys(ans);
	}

	public void register()
	{
		submit.click();
	}
	
}
