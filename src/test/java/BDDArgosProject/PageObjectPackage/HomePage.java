package BDDArgosProject.PageObjectPackage;

import BDDArgosProject.BaseClassPackage.DriverFactory;
import BDDArgosProject.BaseClassPackage.Hooks;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    @FindBy(className = "_1Rz0y")
    WebElement searchBox;

    @FindBy(className = "_1gqeQ")
    WebElement searchButton;

    public void seachBoxSendkey() throws InterruptedException {
        Thread.sleep(1000);
        searchBox.sendKeys("puma");
    }
    public void searchButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        searchButton.click();
    }
    public void homePageAssert() throws InterruptedException {
        Thread.sleep(2000);
        String actualHomePageURL = driver.getCurrentUrl();
        Assert.assertThat(actualHomePageURL, Matchers.containsString("argos.co.uk"));
    }
    public void pumaAssertion() throws InterruptedException {
        Thread.sleep(2000);
     //   String actualPumaAssertion = pumaProduct.getText();
       // Assert.assertThat(actualPumaAssertion,Matchers.containsString("puma"));
    }

}
