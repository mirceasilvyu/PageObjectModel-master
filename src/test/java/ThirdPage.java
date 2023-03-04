import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ThirdPage extends PageObject {
    public ThirdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#entry_216842 ")
    private WebElement addToCartProduct;
    @FindBy(xpath = "//*[@id=\'column-right\']/div/a[14]")
    private WebElement logMeOutButton;
    @FindBy(css = "#content > p:nth-child(3)")
    private WebElement verifyLogMeOut;
    @FindBy(xpath = "//*[@id=\'account-login\']/div[1]")
    private WebElement wrongPassword;


public void clickOnAddToCart(){this.addToCartProduct.click();}
public void clickLogMeOutButton(){this.logMeOutButton.click();}
    public String clickVerifyLogMeOut(){return verifyLogMeOut.getText();}
    public String clickVerifyWrongPassword(){return wrongPassword.getText();}


}
