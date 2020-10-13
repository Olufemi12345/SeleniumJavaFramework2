package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Advanced_homePage {
  WebDriver driver;
  public Advanced_homePage(Common_Steps common_steps){
		 this.driver=common_steps.getDriver();
	 }
	@Given("I am on Ebay Advanced Page")
	public void i_am_on_Ebay_Advanced_Page() {
	driver.get("https://www.ebay.com/sch/ebayadvsearch");
	   
	}

	@When("I click on Ebay logo")
	public void i_click_on_Ebay_logo() {
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/header[1]/div[1]/ul[1]/li[3]/a[1]")).click();
	driver.findElement(By.id("gh-ug")).click();
	}

	@Then("I am navigated to Ebay Home")
	public void i_am_navigated_to_Ebay_Home() {
		
	}

	@When("I advanced on Ebay logo")
	public void i_advanced_on_Ebay_logo(DataTable dataTable) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1,0));
	  driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1,1));  
	  driver.findElement(By.xpath("//input[@name=\"_udlo\"]")).sendKeys(dataTable.cell(1,2));
	  driver.findElement(By.xpath("//input[@name=\"_udhi\"]")).sendKeys(dataTable.cell(1,3));
	  driver.findElement(By.xpath("//button[@id='searchBtnLowerLnk']")).click();
	  Thread.sleep(3000l);
	}

}
