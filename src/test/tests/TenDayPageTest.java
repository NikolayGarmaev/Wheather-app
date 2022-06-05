package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TenDayPage;

public class TenDayPageTest extends BaseTest {
    HomePage homePage;
    TenDayPage tenDayPage;

    @BeforeMethod
    public void localSetUp() {

        homePage = new HomePage(getDriver());
        tenDayPage = new TenDayPage(getDriver());
    }
    @Test(testName = "weather for 10 days", description = "10 future days weather review")
    public void test01() {
        homePage.click(homePage.popUpCloseBtn);
        homePage.click(homePage.tendayBtn);
        for (int i = 0; i < tenDayPage.days.size(); i++) {
            String day = tenDayPage.days.get(i).getText();
            String temperature = tenDayPage.temperatures.get(i).getText().replace("\n", "");
            String description = tenDayPage.descriptions.get(i).getText();
            System.out.println(day + " - " + temperature + " - " + description);
        }
    }
}

