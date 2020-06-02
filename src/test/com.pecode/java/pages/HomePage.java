package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseSearchPage {

    //....

    public HomePage(WebDriver driver) {
        super(driver);
        this.initElements();
    }

    private void initElements(){
        // ....
    }

    public AllSearchResultPage search(String searchText){
        fillSearchField(searchText);
        submitSearchField();
        return new AllSearchResultPage(this.driver);
    }
}
