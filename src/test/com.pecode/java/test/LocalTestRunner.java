package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class LocalTestRunner {
    protected WebDriver driver;
    private final String homeUrl = "https://www.google.com";

    protected abstract void setupDriver();

    protected WebDriver getDriver() {
        if(driver == null) {
            setupDriver();
        }
        return driver;
    }

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
    }


    @BeforeMethod
    public void beforeMethod(){
        getDriver().get(homeUrl);
    }

    public HomePage loadHome(){
        return new HomePage(getDriver());
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        if(driver != null){
            driver.quit();
        }
    }
}
