package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;

	@Given("User is in main page")
	public void user_is_in_main_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\techfioscucumberframework.qa\\driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.get("https://techfios.com/test/102/index.php");
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@When("User clicks Set SkyBlue Background Button")
	public void user_clicks_Set_SkyBlue_Background_Button() {

		driver.findElement(By.xpath("//button[@onclick='myFunctionSky()']")).click();
	}

	@Then("the background color is observed to change successfully to Blue")
	public void the_background_color_is_observed_to_change_successfully_to_Blue() {
		
		boolean blue_backgroundcolor_displayed =driver.findElement(By.xpath("//button[@onclick='myFunctionSky()']")).isDisplayed();
		Assert.assertTrue(blue_backgroundcolor_displayed);
	}

	@Then("the user Clicks on Set White Background Button and the background color changes to White")
	public void the_user_Clicks_on_Set_White_Background_Button_and_the_background_color_changes_to_White() {
		
		driver.findElement(By.xpath("//button[@onclick='myFunctionWhite()']")).click();
		boolean white_backgroundcolor_displayed= driver.findElement(By.xpath("//button[@onclick='myFunctionWhite()']")).isDisplayed();
		Assert.assertTrue(white_backgroundcolor_displayed);
		
		driver.quit();
	    
	}



}
