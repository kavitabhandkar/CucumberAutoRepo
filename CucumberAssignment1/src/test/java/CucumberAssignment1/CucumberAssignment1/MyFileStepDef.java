package CucumberAssignment1.CucumberAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFileStepDef {
	
	WebDriver driver;

	@Given("^navigate to gmail page$")
	public void navigate_to_gmail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}

	@When("^user logged in using username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logged_in_using_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9823334335");	 
	     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sairam@1234");
		 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@Then("^render home page$")
	public void render_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}


   
}