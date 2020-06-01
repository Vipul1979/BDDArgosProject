package BDDArgosProject.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUp(){
        driverFactory.openBrowser();
    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}

