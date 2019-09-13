package com.stepdefinition;
 import java.util.List;
	import java.util.Map;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import io.cucumber.datatable.DataTable;

	public class AddTariffPlanSuite {
		static WebDriver driver;
		@Given("User should be in the telecom home pagess.")
		public void user_should_be_in_the_telecom_home_pagess() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lokesh\\eclipse-workspace\\Cucumber\\drivers\\chromedriver.exe");
		     driver = new ChromeDriver();
		     driver.get("http://demo.guru99.com/telecom/");
		    
		}

		@Given("click add tariff buttonss")
		public void click_add_tariff_buttonss() {
			driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		    
		}

		@When("User enter all  datas")
		public void user_enter_all_datas() {
			driver.findElement(By.id("rental1")).sendKeys("6995");
			driver.findElement(By.id("local_minutes")).sendKeys("120");
			driver.findElement(By.id("inter_minutes")).sendKeys("120");
			driver.findElement(By.id("sms_pack")).sendKeys("100");
			driver.findElement(By.id("minutes_charges")).sendKeys("1");
			driver.findElement(By.id("inter_charges")).sendKeys("1");
			driver.findElement(By.id("sms_charges")).sendKeys("1");
		    
		}
		@When("User enter all  datas.")
		public void user_enter_all_datas(DataTable table) {
			List<List<String>> Lists = table.asLists(String.class);
			driver.findElement(By.id("rental1")).sendKeys(Lists.get(1).get(0));
			driver.findElement(By.id("local_minutes")).sendKeys(Lists.get(1).get(1));
			driver.findElement(By.id("inter_minutes")).sendKeys(Lists.get(0).get(3));
			driver.findElement(By.id("sms_pack")).sendKeys(Lists.get(0).get(2));
			driver.findElement(By.id("minutes_charges")).sendKeys(Lists.get(2).get(4));
			driver.findElement(By.id("inter_charges")).sendKeys(Lists.get(3).get(5));
			driver.findElement(By.id("sms_charges")).sendKeys(Lists.get(1).get(6));
		    
		}
		@When("User enter all  datass.")
		public void user_enter_all_datass(io.cucumber.datatable.DataTable table1) {
			List<Map<String, String>> Maps = table1.asMaps(String.class,String.class);
			driver.findElement(By.id("rental1")).sendKeys(Maps.get(2).get("rent"));
			driver.findElement(By.id("local_minutes")).sendKeys(Maps.get(3).get("freeloc"));
			driver.findElement(By.id("inter_minutes")).sendKeys(Maps.get(3).get("freeint"));
			driver.findElement(By.id("sms_pack")).sendKeys(Maps.get(3).get("freesms"));
			driver.findElement(By.id("minutes_charges")).sendKeys(Maps.get(3).get("locchr"));
			driver.findElement(By.id("inter_charges")).sendKeys(Maps.get(3).get("intchr"));
			driver.findElement(By.id("sms_charges")).sendKeys(Maps.get(3).get("sms"));
		   
		}
		@When("User enter all  data.{string},{string},{string},{string},{string},{string},{string}")
		public void user_enter_all_data(String rent, String freeloc, String freeint, String freesms, String locchr, String intchr, String sms) {
			driver.findElement(By.id("rental1")).sendKeys(rent);
			driver.findElement(By.id("local_minutes")).sendKeys(freeloc);
			driver.findElement(By.id("inter_minutes")).sendKeys(freeint);
			driver.findElement(By.id("sms_pack")).sendKeys(freesms);
			driver.findElement(By.id("minutes_charges")).sendKeys(locchr);
			driver.findElement(By.id("inter_charges")).sendKeys(intchr);
			driver.findElement(By.id("sms_charges")).sendKeys(sms);  
		}


		@When("click on submit buttons.")
		public void click_on_submit_buttons() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		}

		@Then("user should be displayed home button is enteredd.")
		public void user_should_be_displayed_home_button_is_enteredd() {
			WebElement tffId = driver.findElement(By.xpath( "(//a[text()='Home'])[1]"));
		    Assert.assertTrue(tffId.isDisplayed());
		    
		}



	}



