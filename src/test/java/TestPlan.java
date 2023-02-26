import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    public static final WebDriver driver = new ChromeDriver();
    @Test(testName="Search for product buy and delete ")
    public void searchForProduct() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.populateSearchField();
        webForm.clickSearchBar();
        SecoundPage webFrom1 = new SecoundPage(driver);
        webFrom1.clickOnMyProduct();
        ThirdPage webForm3 = new ThirdPage(driver);
        webForm3.clickOnBuyMyProduct();
        webForm3.clickOnMyCart();
        webForm3.clickOnQuantity();
        webForm3.clickOnQuantity1();
      //Nu mere // webForm3.clickOnDeleteMyProduct();
    }
    @Test(testName="Change Curency into Ron")
    public void changeTheCurency(){
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.clickOnChangeCurency();
        SecoundPage webForm2= new SecoundPage(driver);
        webForm2.clickonDropCurencyList();
        webForm2.clickOnEuroCurency();
        webForm2.clickSaveCurencyChange();
    }
    @Test(testName ="Buy 7 products verify the price" )
    public void buy7products(){
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        driver.get(Utils.BASE_URL);
        webForm.populateSearchField();
        webForm.clickSearchBar();
        SecoundPage webFrom1 = new SecoundPage(driver);
        webFrom1.clickOnMyProduct();
        ThirdPage webForm3 = new ThirdPage(driver);
        webForm3.clickOnBuyMyProduct();
        webForm3.clickOnMyCart();
        webForm3.clickOnQuantity();
        webForm3.clickOnQuanitity7();
        //need a check quantity price
        webForm3.clickOnProceedToCheckOut();
        webForm3.clickOnHelpAmazon();
        //need a warning message

    }


}
