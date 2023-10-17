package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenerioOutline {

    @Given("User is at signup page")
    public void user_is_at_signup_page() {
        System.out.println("User is at signup page");
    }
    @When("user enters name {string}")
    public void user_enters_name(String userName) {
        System.out.println("user name is " + userName);
    }
    @When("User enters surname {string}")
    public void user_enters_surname(String surName) {
        System.out.println("surname is " + surName);
    }
    @When("User enters age {int} into form")
    public void user_enters_into_form(Integer age) {
        System.out.println("user's age is " + age);
    }
    @When("User enters email as {string}")
    public void user_enters_email_as(String email) {
        System.out.println("user's mail is " + email);
    }
    @Then("New User is created")
    public void new_user_is_created() {
        System.out.println("user is created");
    }

    @Given("User press Create button")
    public void user_press_create_button() {
        System.out.println("User click on create button ");
    }
    @Then("Profile is created with {string} as title")
    public void profile_is_created_with_as_title(String profile) {
        System.out.println("Profile created with " + profile );
    }


}
