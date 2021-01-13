package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\pgurumallaiah\\Cucumber\\CucumberdemoframeworkDrivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pgurumallaiah\\Cucumber\\Cucumberdemo\\src\\main\\java\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	  lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    
		lp.setusername(email);
		lp.setpassword(password);
		
	}

	@When("Click on Login")
	public void click_on_login() {
	 lp.login();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		
//		String title="Dashboard / nopCommerce administration";
		
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
	 lp.logout();
	Thread.sleep(3000);
	}
	

	@Then("close browser")
	public void close_browser() {
	   
		driver.close();
	}

	
	
}
