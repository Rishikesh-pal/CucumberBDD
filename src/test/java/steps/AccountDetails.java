package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class AccountDetails {
    @Given("User is at opening account page")
    public void user_is_at_opening_account_page() {
        System.out.println("User at opening a/c page");
    }
    @When("User enters the dsetails")
    public void user_enters_the_dsetails(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
//        List<List<String>> data = dataTable.asLists();
//        List<String> firstList = data.get(1);
//        System.out.println(firstList);
//        String firstElement = data.get(1).get(2);
//        System.out.println(firstElement);


        List<Map<String, String>> data1 = dataTable.asMaps();

        String mobilenumber = data1.get(1).get("mobile");

        System.out.println(mobilenumber);
    }
    @When("User click on submit button")
    public void user_click_on_submit_button() {
        System.out.println("click on submit");
    }
    @Then("Account is created")
    public void account_is_created() {
        System.out.println("created");
    }

}
