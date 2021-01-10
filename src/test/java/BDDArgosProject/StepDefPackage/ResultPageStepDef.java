package BDDArgosProject.StepDefPackage;

import BDDArgosProject.PageObjectPackage.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultPageStepDef {
    ResultPage resultPage = new ResultPage();
    @Given("^user search for  nike$")
    public void userSearchForNike() {
    resultPage.useronNikePage();
    }
    @When("^user click on (\\d+) to (\\d+) price$")
    public void user_click_on_to_price(int arg1, int arg2) throws Throwable {
    }
    @Then("^user can see all nike product between (\\d+) to (\\d+) price$")
    public void user_can_see_all_nike_product_between_to_price(int arg1, int arg2) throws Throwable {
    resultPage.priceAssert();
    }



}
