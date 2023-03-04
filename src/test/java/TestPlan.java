import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestPlan {
    public static final WebDriver driver = new ChromeDriver();

    public static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test(testName = "Verify the function of the Home button")
    public void homebutton() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.clickSpecialOffers();
        System.out.println(webForm.clickCheckSpecialOffers());
        Assert.assertTrue(webForm.clickCheckSpecialOffers().contains("Special"));
//Passed
    }
    @Test(testName=" Verify the function of the Blog Button")
    public void blogbutton(){
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.clickMyBlog();
        System.out.println(webForm.clickCheckMyBlog());
        Assert.assertTrue(webForm.clickCheckMyBlog().contains("Blog"));
    }
    @Test(testName="Search Product and Add to Cart ")
    public void searchProduct(){
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.populateSearchField();
        webForm.clickSearchBar();
        SecoundPage webForm2 = new SecoundPage(driver);
        webForm2.clickOnMyProduct();
        waitFor(3000);
        ThirdPage webForm3 = new ThirdPage(driver);
        waitFor(3000);
       webForm3.clickOnAddToCart();
            }
            @Test(testName="Acces Account and logout")
            public void login(){
        driver.get((Utils.BASE_URL));
        FirstPage webForm= new FirstPage(driver);
        webForm.clickMyAccountButton();
        SecoundPage webForm2= new SecoundPage(driver);
        webForm2.clickMyEmailAdress();
        webForm2.clickMyPassword();
        waitFor(3000);
        webForm2.clickMyLoginButton();
        ThirdPage webForm3 = new ThirdPage(driver);
        waitFor(3000);
        webForm3.clickLogMeOutButton();
        System.out.println(webForm3.clickVerifyLogMeOut());
        waitFor(3000);
        Assert.assertTrue(webForm3.clickVerifyLogMeOut().contains("You have been logged off your account. It is now safe to leave the computer."));
     }
     @Test(testName = "Login and Wrong Password")
     public void logInWrong(){
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.clickMyAccountButton();
        SecoundPage webFrom2 = new SecoundPage(driver);
        webFrom2.clickMyLoginButton();
        webFrom2.clickMyWrongPassword();
        webFrom2.clickMyLoginButton();
        waitFor(3000);
        ThirdPage webForm3= new ThirdPage(driver);
        System.out.println(webForm3.clickVerifyWrongPassword());
        waitFor(3000);
        Assert.assertTrue(webForm3.clickVerifyWrongPassword().contains("Warning:"));

     }
     @Test(testName = )
    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
       // driver.close();
    }
}


