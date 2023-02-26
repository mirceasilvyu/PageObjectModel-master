import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends PageObject {
    private final String SEARCH_PRODUCT="jbl boom box 2";

    FirstPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\'twotabsearchtextbox\']")
    private WebElement searchBar;
    @FindBy(xpath ="//*[@id=\'nav-search-submit-button\']")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\'icp-nav-flyout\']/span/span[2]/span[1]")
    private WebElement changeCurency;

    public void populateSearchField(){this.searchBar.sendKeys(SEARCH_PRODUCT);}
    public void clickSearchBar(){this.searchButton.click();}
    public void clickOnChangeCurency(){this.changeCurency.click();}


}
