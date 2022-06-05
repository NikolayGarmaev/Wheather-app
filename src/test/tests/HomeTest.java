package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

import java.util.List;

public class HomeTest extends BaseTest {

    HomePage homePage;
    SeleniumUtils seleniumUtils;

    @BeforeMethod
    public void localSetUp(){

        homePage = new HomePage(getDriver());
    }
    @Test(testName = "main page pop-up window", description = "validate pop-up text")
    public void test1() {
        System.out.println(homePage.getText(homePage.popUpText));
        homePage.click(homePage.popUpCloseBtn);
    }


    @Test(testName = "facebook link", description = "validating facebook title")
    public void test2() {
        homePage.click(homePage.popUpCloseBtn);
        homePage.click(homePage.faceBookBtn);
        seleniumUtils.switchToNextWindow();
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals(actualTitle, "The Weather Channel - Home | Facebook");
    }

    @Test(testName = "twitter link", description = "validating twitter title")
    public void test3() {
        homePage.click(homePage.popUpCloseBtn);
        homePage.click(homePage.twitterBtn);
        seleniumUtils.switchToNextWindow();
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals(actualTitle, "The Weather Channel (@weatherchannel) / Twitter");
    }


    @Test(testName = "youtube link", description = "validating youtube title")
    public void test4() {
        homePage.click(homePage.popUpCloseBtn);
        homePage.click(homePage.youtubeBtn);
        seleniumUtils.switchToNextWindow();
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals(actualTitle, "The Weather Channel - YouTube");
    }
    @Test(testName = "10 day page", description = "validating 10 day weather")
    public void test5() {
        homePage.click(homePage.popUpCloseBtn);
        homePage.click(homePage.tendayBtn);

    }
}
