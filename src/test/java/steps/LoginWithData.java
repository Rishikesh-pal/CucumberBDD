package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
    @Given("User should be at login page")
    public void user_should_be_at_login_page() {
        System.out.print("User is at login page");
    }
    @When("User enters username {string}")
    public void user_enters_username(String user) {
        System.out.println("enters" + user);
    }
    @When("User enters {string} password")
    public void user_enters_password(String pass) {
        System.out.println("enters" + pass);
    }
    @When("User clicks enter buttom")
    public void user_clicks_enter_buttom() {
        System.out.println("click enter");
    }
    @Then("User is at home page url")
    public void user_is_at_home_page_url() {
        System.out.println("user at home");
    }


}
