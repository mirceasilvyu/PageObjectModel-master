import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecoundPage extends PageObject {
    private final String LOGIN_INEMAIL="mirceasilvyu@gmail.com";
    private final String PASSWORD="0123456789";
    private final String WRONG_PASSWORD_CASE="565698";
    public SecoundPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\'mz-product-grid-image-31-212469\']/div/div[1]/img")
    private WebElement myProduct;
    @FindBy(xpath = "//*[@id=\'input-email\']")
    private WebElement emailadress;
    @FindBy(xpath = "//*[@id=\'input-password\']")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\'input-password\']")
    private WebElement wrongPassword;
    @FindBy(xpath = "//*[@id=\'content\']/div/div[2]/div/div/form/input[1]")
    private WebElement loginButton;

    public void clickOnMyProduct() {this.myProduct.click();}
    public void clickMyEmailAdress(){this.emailadress.sendKeys(LOGIN_INEMAIL);}
    public void clickMyPassword(){this.password.sendKeys(PASSWORD);}
    public void clickMyLoginButton(){this.loginButton.click();}
    public void clickMyWrongPassword(){this.wrongPassword.sendKeys(WRONG_PASSWORD_CASE);}





}


