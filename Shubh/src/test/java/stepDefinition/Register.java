package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	RegisterObjects obj;
	PageObjects obj1;
	@Given("I have chosen to Register in the TestMe App")
	public void i_have_chosen_to_Register_in_the_TestMe_App() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Shubham Drivers\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //Launch Chrome Browser
		
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		obj=new RegisterObjects(driver);
		obj1=new PageObjects(driver);
		obj.link_signup();
	}

	@When("I Enter the username {string}")
	public void i_Enter_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.username("mahivirusach");
	}

	@Then("I Enter the firstname {string}")
	public void i_Enter_the_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.firstname("mahendraziva");
	}

	@Then("I Enter the lastname {string}")
	public void i_Enter_the_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.lastname("feugittre");
	}

	@Then("I Enter the password {string}")
	public void i_Enter_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		obj.password("dustin12111");
	}

	@Then("I Enter the confirm password {string}")
	public void i_Enter_the_confirm_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		obj.confirmpass("dustin12111");
	}
	
	@Then("I choose the Gender")
	public void i_choose_the_Gender() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.genmale();
	}
	
	@Then("I Enter the email {string}")
	public void i_Enter_the_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.emailid("shubasawaaaah@gmail.com");
	}
	
	@Then("I Enter the Moblie Number as {string}")
public void i_Enter_the_Moblie_Number_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
		obj.mobileno("1235632893");
}

@Then("I Enter the DOB as {string}")
public void i_Enter_the_DOB_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	obj.date("19/06/1987");
}

@Then("I Enter the Address as {string}")
public void i_Enter_the_Address_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	obj.address("Borivi  east Et Mumfibsd");
}

@Then("I Choose the Security Question")
public void i_Choose_the_Security_Question() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	obj.security();
}

@Then("I Enter the Answer as {string}")
public void i_Enter_the_Answer_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	obj.answer("Mumbai singh fvf vgvgv ");
}

@Then("I click on Register")
public void i_click_on_Register() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	obj.register();
}

@When("I click on Login")
public void i_click_on_Login() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	//obj1.link_sigin();
	obj1.name_username("Lalitha");
	obj1.name_password("Password123");
	obj1.name_login();
}
	
}
