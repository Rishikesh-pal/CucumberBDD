package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is at login page")
    public void user_is_at_login_page() {
        System.out.print("User is at login page");
    }
    @When("User enters username")
    public void user_enters_username() {
        System.out.println("User enters username");
    }
    @When("User enters password")
    public void user_enters_password() {
        System.out.println("User enters password");
    }
    @When("User clicks enter")
    public void user_clicks_enter() {
        System.out.println("User clicks enter");
    }
    @Then("User is at home page")
    public void user_is_at_home_page() {
        System.out.println("User is at home page");
    }

    @Then("Title of the home page exist")
    public void title_of_the_home_page_is() {
        System.out.println("title is ");
    }

}
