package stepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(Cucumber.class)
public class LoginSD {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Ïn Login Page");
    }

    @When("^User enters username and password and clicks on login button$")
    public void user_enters_username_and_password_and_clicks_on_login_button() throws Throwable {
        System.out.println("Entered credentials");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        System.out.println("Logged into Home page");
    }

    @And("^UserName is dispalyed$")
    public void username_is_dispalyed() throws Throwable {
        System.out.println("UserName is displayed");
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and clicks on login button$")
    public void user_enters_and_and_clicks_on_login_button(String userName, String password) throws Throwable {
        System.out.println("The Username is: " + userName);
        System.out.println("The Password is: " + password);
    }

    @Then("^Shopping cart displayed is \"([^\"]*)\"$")
    public void shopping_cart_displayed_is(String check) throws Throwable {
        if (check.equals("true")) {
            System.out.println("The cart is present");
        } else {
            System.out.println("The cart is not present");
        }
    }
    
    @When("^User enters (.+) and (.+) and logs in $")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
        System.out.println("The Username is: " + username);
        System.out.println("The Password is: " + password);
    }
    
    @When("^User enters test(\\d+)@gmail\\.com and (\\d+) and logs in$")
    public void user_enters_test_gmail_com_and_and_logs_in(int username, int password) throws Throwable {
        System.out.println("The Username is: " + username);
        System.out.println("The Password is: " + password);
    }

    
    
    

}
