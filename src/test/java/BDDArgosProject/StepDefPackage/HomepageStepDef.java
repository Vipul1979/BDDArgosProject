package BDDArgosProject.StepDefPackage;

import BDDArgosProject.PageObjectPackage.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageStepDef {
    HomePage homePage = new HomePage();
    @Given("^user is on argos homepage$")
    public void user_is_on_argos_homepage() throws Throwable {
    homePage.homePageAssert();
    }

    @When("^user search puma$")
    public void user_serach_puma() throws Throwable {
    homePage.seachBoxSendkey();
    }
    @And("^user click on search button$")
    public void userClickOnSearchButton() {
    homePage.searchButtonClick();
    }
    @Then("^user can see all puma product$")
    public void user_can_see_all_puma_product() throws Throwable {
    homePage.pumaAssertion();
    }

}
