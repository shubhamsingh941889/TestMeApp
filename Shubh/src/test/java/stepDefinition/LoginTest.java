package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver driver;
	PageObjects obj;
	@Given("I have to login in Testmeapp")
	public void i_have_to_login_in_Testmeapp() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Shubham Drivers\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //Launch Chrome Browser
		
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		obj=new PageObjects(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I have to enter username and password")
	public void i_have_to_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		obj.link_sigin();
		obj.name_username();
		obj.name_password();
		/*driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");*/
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Click on login Button")
	public void click_on_login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.name_login();
		//driver.findElement(By.name("Login")).click();
	}

	@Then("Directed to new page")
	public void directed_to_new_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.close();
		System.out.println("User registered");
	}
	
	
}
