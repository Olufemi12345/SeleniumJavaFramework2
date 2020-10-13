package steps;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class EBAY_HOME_STEP {
 WebDriver driver;
 public EBAY_HOME_STEP(Common_Steps common_steps){
	 this.driver=common_steps.getDriver();
 }
	@Given("I am on Ebay Home Page")
	public void i_am_on_Ebay_Home_Page() {
		driver.get("https://www.ebay.co.uk/");
	   System.out.println("I am on Ebay Home Page");
	}

	@When("I click on Advance Link")
	public void i_click_on_Advance_Link() {
		driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
		 System.out.println("I click on Advance Link"); 
	}

	@Then("I navigate to Advanced Home Page")
	public void i_navigate_to_Advanced_Home_Page() {
	String expUrl="https://www.ebay.com/sch/ebayadvsearch";
	String actUrl=driver.getCurrentUrl();
	if(!expUrl.equals(actUrl)) {
		
	fail("I can not find it");
	}
	
	}
	private void fail(String string) {
	}
	
	

	@When("I search for {string}")
	public void i_search_for_IPHONE(String str1) {
    driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str1);
    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}

	@Then("I validate at least more than {int} search items present")
	public void i_validate_at_least_more_than_search_items_present(int count) {
	String ItemCount=driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim();
	String ItemCount2= ItemCount.replace(",", "");
	
	int ItemCountInt= Integer.parseInt(ItemCount2);
	if(ItemCountInt<=count) {
		fail("Less than 1000 results shown");
	}
	driver.quit();
	}
	@When("I click on {string}")
	public void i_click_on(String string) {
	driver.findElement(By.linkText(string)).click();
	}

	@Then("I validate that the page navigate to 'https:\\/\\/www.ebay.com\\/b\\/Toys-Hobbies\\/{int}\\/bn_{int}'and title contains 'Toys'")
	public void i_validate_that_the_page_navigate_to_https_www_ebay_com_b_Toys_Hobbies_bn__and_title_contains_Toys(Integer int1, Integer int2) {
	    
	}

}
