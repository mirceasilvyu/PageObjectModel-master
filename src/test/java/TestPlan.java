import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestPlan {
    public static final WebDriver driver = new ChromeDriver();
    public static void waitFor(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
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
        waitFor(3000);
        ///
//        String actualString = driver.findElement(By.xpath("//*[@id=\'sc-active-cart\']/div/div/div/h1")).getText();
//        Assert.assertTrue(actualString.contains(" Your Amazon Cart is empty."));
//        String specificText = "was removed from Shopping Cart.";
//        assertEquals(specificText ,driver.findElement(By.xpath("//*[@id=\'sc-active-C0ff389bd-a05b-4f55-a5f7-80f58135ae27\']/div/div[1]")).getText());
//        WebElement alert=driver.findElement(By.xpath("//*[@id=\'sc-active-Cffbae8a8-4688-4ba3-99a7-ef6a4faf7c9d\']/div/div[1]/span"));
//        String alertText = " was removed from Shopping Cart.";
//        Assert.assertTrue(alert.isDisplayed());
//        //Assert.assertTrue(alert.getText().contains(alertText));
        System.out.println(webForm3.clickemptyCart());
        Assert.assertTrue(webForm3.clickemptyCart().contains("Amazon Cart is empty"));
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
       // webForm3.clickOnProceedToCheckOut();
        //webForm3.clickOnHelpAmazon();
        //need a warning message

        }
    }

//Build Project -on xml file-raport erori