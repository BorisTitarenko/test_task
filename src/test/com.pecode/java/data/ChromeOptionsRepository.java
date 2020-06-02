package data;

import data.Language;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsRepository {
    private ChromeOptionsRepository(){}

    public static ChromeOptions getEnLanguage(){
        return new ChromeOptions().addArguments("--lang=" + Language.EN);
    }
    public static ChromeOptions getUaLanguage(){
        return new ChromeOptions().addArguments("--lang=" + Language.UA);
    }
}
