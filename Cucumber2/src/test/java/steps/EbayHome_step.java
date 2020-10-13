package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EbayHome_step {
	WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","webdriver/chromedriver.exe");
		this.driver=new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Given("User is on Ebay Home Page")
	public void user_is_on_Ebay_Home_Page() {
	    System.out.println("User is on Ebay Home Page");
	    driver.get("https://www.ebay.com/");
	}



	@When("Use clicks on Advanced Link")
	public void use_clicks_on_Advanced_Link() {
		//System.out.println("Use clicks on Advanced Link");
		
		
	}
	

	@Then("User navigate to Advanced Search Page")
	public void user_navigate_to_Advanced_Search_Page() {
		//System.out.println("User navigate to Advanced Search Page");
		
		
	}
	
}
