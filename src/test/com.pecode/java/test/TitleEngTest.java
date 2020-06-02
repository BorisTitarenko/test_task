package test;

import data.UnicodeLangRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.WordsGenerator;

import java.util.Random;

public class TitleEngTest extends EnLangLocalTesRunner {
    private final String titleFormat = "%s - Google Search";
    private Logger logger = LoggerFactory.getLogger(TitleEngTest.class);

    @DataProvider
    public Object[][] getData(){
        String searchWord = WordsGenerator.getInstance()
                .getRandomWord(UnicodeLangRepository.getLatin(), new Random().nextInt(10));
        String expectedTitle = String.format(titleFormat, searchWord);
        return new Object[][] {{searchWord, expectedTitle}};
    }

    @Test(dataProvider = "getData")
    public void titleSearchResultTest(String searchWord, String expectedTitle)
    {
        logger.info("Test search result title for word {}", searchWord);

        loadHome()
                .search(searchWord);

        logger.trace("Current page title is {}", driver.getTitle());
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}
