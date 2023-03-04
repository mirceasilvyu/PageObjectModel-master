import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class FirstPage extends PageObject {
    private final String SEARCH_PRODUCT="Nikon d300";



    FirstPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\'search\']/div[1]/div[1]/div[2]/input")
    private WebElement searchBar;
    @FindBy(xpath ="//*[@id=\'search\']/div[2]/button")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[2]/a")
    private WebElement specialOffers;
    @FindBy(xpath ="//*[@id=\'widget-navbar-217834\']/ul/li[2]/a" )
    private WebElement checkSpecialOffers;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[3]/a/div/span")
    private WebElement myBlog;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[3]/a/div/span")
    private WebElement checkMyBlog;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[6]/a/div/span")
    private WebElement myAccountButton;


    public void populateSearchField(){this.searchBar.sendKeys(SEARCH_PRODUCT);}
    public void clickSearchBar(){this.searchButton.click();}
    public void clickSpecialOffers(){this.specialOffers.click();}
    public String clickCheckSpecialOffers(){return checkSpecialOffers.getText();}
    public void clickMyBlog(){this.myBlog.click();}
    public String clickCheckMyBlog(){return checkMyBlog.getText();}
    public void clickMyAccountButton(){ this.myAccountButton.click();}


    }

