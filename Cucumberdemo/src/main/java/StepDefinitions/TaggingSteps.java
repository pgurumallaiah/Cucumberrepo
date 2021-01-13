package StepDefinitions;

import io.cucumber.java.en.*;

public class TaggingSteps {


@Given("This is valid login test")
public void this_is_valid_login_test() {
System.out.println("This is login test");
}


@Given("This is logout test")
public void this_is_logout_test() {  
System.out.println("This is logout test");

}


@Given("This is search test")
public void this_is_search_test() {
System.out.println("This is search test");
}


@Given("This is advanced search")
public void this_is_advanced_search() {
  System.out.println("This is advanced search test");
}

@Given("This is prepaid recharge")
public void this_is_prepaid_recharge() {
    System.out.println("This is prepaid recharge test");
}

@Given("This is Postpaid recharge test")
public void this_is_postpaid_recharge_test() {
 System.out.println("This is postpaid recharge test");
}
}
