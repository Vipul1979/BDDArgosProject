package BDDArgosProject.PageObjectPackage;

import BDDArgosProject.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverFactory {


    @FindBy(xpath = "//*[@id=\"filter-price-£5 - £10-label\"]/div/div/svg")
    WebElement search5to10Checkbox;

    @FindBy(css = ".ProductCardstyles__PriceText-l8f8q8-14.gHrEdF")
    List<WebElement> allPrices;

    public void useronNikePage(){
        String resultPageURL = driver.getCurrentUrl();
        Assert.assertThat(resultPageURL,Matchers.containsString("nike"));

    }
    public void selectPrice5to10() throws InterruptedException {
        Thread.sleep(1000);
        search5to10Checkbox.click();
    }

    public void priceAssert() throws InterruptedException {
        for (WebElement allPrice:allPrices
             ) {System.out.println(allPrice.getText());
        }
       Thread.sleep(3000);
        //Integer actual = allPrices.hashCode();
        //Assert.assertThat(actual, Matchers.greaterThanOrEqualTo(7));
    }
}
