package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TenDayPage extends BasePage {
    protected WebDriver driver;

    public TenDayPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//div[@data-testid='DetailsSummary']/h3[contains (@data-testid,'')]")
    public List<WebElement> days;

    @FindBy (xpath = "//div[@data-testid='DetailsSummary']/div[@data-testid='detailsTemperature']")
    public List <WebElement> temperatures;

    @FindBy (xpath = "//div[@data-testid='DetailsSummary']//span[@class='DetailsSummary--extendedData--365A_']")
    public List <WebElement> descriptions;


}
