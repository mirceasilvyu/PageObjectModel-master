import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecoundPage extends PageObject{
    public SecoundPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
    private WebElement myProduct;
    @FindBy(xpath ="//*[@id=\'icp-currency-dropdown-selected-item-prompt\']/span/span" )
    private WebElement dropDownCurencyList;
    @FindBy(xpath = "//*[@id=\'icp-currency-dropdown_19\']")
    private WebElement euroCurencySelection;
    @FindBy(xpath = "//*[@id=\"icp-save-button\"]/span/input")
    private WebElement saveCurencyChange;
    @FindBy(xpath = "//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
    private WebElement secoundProduct;
    public void clickOnMyProduct(){this.myProduct.click();}
    public void clickonDropCurencyList(){this.dropDownCurencyList.click();}
    public void clickOnEuroCurency(){this.euroCurencySelection.click();}
    public void clickSaveCurencyChange() {this.saveCurencyChange.click();}
        public void clickOnSecoundProduct () {this.secoundProduct.click();}

    }


