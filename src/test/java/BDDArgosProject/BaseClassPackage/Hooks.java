package BDDArgosProject.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before //It will run before each scenario
    public void setUp(){
        driverFactory.openBrowser();
    }
    @After //It will run after each scenario
    public void tearDown() throws InterruptedException {
        driverFactory.closeBrowser();
    }
}

