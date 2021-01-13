package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksSteps {

	@Before
	public void setup()
	{
		System.out.println("launch browser");
		System.out.println("Logging in to application ");
	
	}
	
	@After
	public void teardown()
	{
		System.out.println("closed browser.......");
		
	
	}
	
	@Given("user is on add customer page")
	public void user_is_on_add_customer_page() {
	System.out.println("user is on add customer page");
	}

	@When("user fills the customer details")
	public void user_fills_the_customer_details() {
	  System.out.println("user fills the customer page");
	}

	@Then("customer is added")
	public void customer_is_added() {
	    System.out.println("user is added");
	}

	@Given("user is on edit customer page")
	public void user_is_on_edit_customer_page() {
	   System.out.println("User is on edit customer page");
	}

	@When("user edits the contact details")
	public void user_edits_the_contact_details() {
	    System.out.println("user edits the contact details");
	}
	
	@Then("contact details updated")
	public void contact_details_updated() {
	   System.out.println("contact details updated");
	}

	@When("user deletes the customer")
	public void user_deletes_the_customer() {
	    
		System.out.println("user deletes the customer");
	}

	@Then("customer deleted")
	public void customer_deleted() {
	  System.out.println("customer deleted");
	}
}