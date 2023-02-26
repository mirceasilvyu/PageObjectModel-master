import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ThirdPage extends PageObject {
    public ThirdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\'add-to-cart-button\']")
    private WebElement buyProduct;
    @FindBy(xpath = "//*[@id=\'sw-gtc\']/span/a")
    private WebElement goToCart;
    @FindBy(xpath = "//*[@id=\'a-autoid-0-announce\']")
    private WebElement quantity;
    @FindBy(xpath = "//*[@id=\'quantity_0\']")
    private WebElement quantity0;
    @FindBy(xpath = "//*[@id=\'quantity_7\']")
    private WebElement quantity7;
    @FindBy(xpath = "//*[@id=\'sc-buy-box-ptc-button\']/span/input")
    private WebElement proceedToCheckOut;
    @FindBy(xpath = "//*[@id=\'a-page\']/div[1]/div[4]/div[2]/a[3]")
    private WebElement helpAmazon;

    public void clickOnBuyMyProduct() {this.buyProduct.click();}
    public void clickOnMyCart(){this.goToCart.click();}
    public void clickOnQuantity(){this.quantity.click();}
    public void clickOnQuantity1(){this.quantity0.click();}
    public void clickOnQuanitity7(){this.quantity7.click();}
    public void clickOnProceedToCheckOut(){this.proceedToCheckOut.click();}
    public void clickOnHelpAmazon(){this.helpAmazon.click();}
//


}
