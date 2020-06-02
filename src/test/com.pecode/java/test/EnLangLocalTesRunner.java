package test;

import data.ChromeOptionsRepository;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class EnLangLocalTesRunner extends LocalTestRunner {

    protected void setupDriver() {
        driver = new ChromeDriver(ChromeOptionsRepository.getEnLanguage());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
