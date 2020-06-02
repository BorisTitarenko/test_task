package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseSearchPage{
    protected WebDriver driver;
    private WebElement searchField;


    public BaseSearchPage(WebDriver driver) {
        this.driver = driver;
        this.initElements();
    }

    private void initElements(){
        searchField = driver.findElement(By.name("q"));
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void clickSearchField(){
        getSearchField().click();
    }

    public void clearSearchField(){
        getSearchField().clear();
    }

    public void typeSearchField(String searchText){
        getSearchField().sendKeys(searchText);
    }

    public void fillSearchField(String searchText){
        clickSearchField();
        clearSearchField();
        typeSearchField(searchText);
    }

    public void submitSearchField(){
        getSearchField().submit();
    }



}
