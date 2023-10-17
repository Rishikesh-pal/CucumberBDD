package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenerioOutlineAssignment {

    @Given("User is at signup page of amazon")
    public void user_is_at_signup_page_of_amazon() {
        System.out.println("user is at login");
    }
    @When("user enters First name {string}")
    public void user_enters_first_name(String name) {
        System.out.println("user enter name "+ name);

    }
    @When("User enters Last name {string}")
    public void user_enters_last_name(String lname) {
        System.out.println("user enters l name" + lname);

    }
    @When("User enters age as {int} into form")
    public void user_enters_age_as_into_form(Integer int1) {
        System.out.println("age " + int1);

    }
    @When("User enters personal emailId as {string}")
    public void user_enters_personal_email_id_as(String id) {
        System.out.println("email : "+ id);

    }
    @Then("New User is created with provided details")
    public void new_user_is_created_with_provided_details() {

    }
}
