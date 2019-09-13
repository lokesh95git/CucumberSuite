package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomerListsSuite {
	static WebDriver driver;
	@Given("User should be in  telecom home pages")
	public void user_should_be_in_telecom_home_pages() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lokesh\\eclipse-workspace\\Cucumber\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("click add customer buttons..")
	public void click_add_customer_buttons() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User enters all  datass.")
	public void user_enters_all_datass() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("sureshh");
		driver.findElement(By.id("lname")).sendKeys("lokesh");
		driver.findElement(By.id("email")).sendKeys("lokeshsureshhhh12345@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	    
	    
		}
	@When("User enters all  datasss.")
	public void user_enters_all_datasss(DataTable cstList) {
			List<List<String>> Lists = cstList.asLists(String.class);
			driver.findElement(By.xpath("//label[@for='done']")).click();
			driver.findElement(By.id("fname")).sendKeys(Lists.get(1).get(0));
			driver.findElement(By.id("lname")).sendKeys(Lists.get(1).get(1));
			driver.findElement(By.id("email")).sendKeys(Lists.get(1).get(2));
			driver.findElement(By.name("addr")).sendKeys(Lists.get(1).get(3));
			driver.findElement(By.id("telephoneno")).sendKeys(Lists.get(1).get(4));
	}
	@When("User enters all  datas.")
	public void user_enters_all_datas(DataTable cstMap) {
		List<Map<String, String>> Maps = cstMap.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(Maps.get(2).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(Maps.get(2).get("lname"));
		driver.findElement(By.id("email")).sendKeys(Maps.get(2).get("email"));
		driver.findElement(By.name("addr")).sendKeys(Maps.get(2).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(Maps.get(2).get("phno"));

	}
	@When("User enters all  data.{string},{string},{string},{string}{string}")
	public void user_enters_all_data(String fname, String lname, String email, String address, String phno) {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phno);
   
	}
	@When("click on submits button.")
	public void click_on_submits_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    }

	@Then("user should been displayed customer id is enteredd.")
	public void user_should_been_displayed_customer_id_is_enteredd() {
		WebElement cstId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	    Assert.assertTrue(cstId.isDisplayed());
	}




}
