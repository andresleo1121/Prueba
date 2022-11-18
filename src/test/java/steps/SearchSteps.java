package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.LoginPage;

public class SearchSteps {
	
	WebDriver driver;
	LoginPage loginPage = new LoginPage(driver);
	
	
	@Given("the user is in the index page falabella")
	public void theUserIsInIndexPage() throws InterruptedException
	{
		
		loginPage.enterWeb();
		
	}
	
	@When("the user enters name and password")
	public void userEnterDressesInSearchBar()
	{
				
		loginPage.enterLogin();
		
	}
	
		
	
	@When("Select streaming")
	public void userSelectStreaming() throws InterruptedException
	{
		
		loginPage.clickStreaming();
				
	}
	
	@Then("sort from lowest to highest price")
	public void userSelectOrder() throws InterruptedException
	{
		loginPage.selectPrice();
		
	}
	
	@When("Select categories tv")
	public void userSelectCategoriestv() throws InterruptedException
	{
		
		loginPage.clickCategoriesTv();
				
	}
	
	@Then("filter by brand")
	public void userSelectBrand() throws InterruptedException
	{
		loginPage.clickFilterBrand();
		
	}
	
	@And("Select product")
	public void userSelectProduct() throws InterruptedException
	{
		loginPage.clickProduct();
		
	}
	
	@When("Select categories pc")
	public void userSelectCategoriespc() throws InterruptedException
	{
		
		loginPage.clickCategoriesPc();
				
	}
	
	@Then("Select price")
	public void userSelectPrice() throws InterruptedException
	{
		loginPage.clickPricePc();
		
	}
	
	@And("End")
	public void userSelectEnd() throws InterruptedException
	{
		loginPage.closeWindow();
		
	}
	

}
