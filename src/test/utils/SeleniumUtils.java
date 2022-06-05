package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SeleniumUtils {
    protected WebDriver driver;

    public void switchToNextWindow() {
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String eachWindow : allWindows) {
            if (!eachWindow.equals(currentWindow)) {
                driver.switchTo().window(eachWindow);

            }
        }
    }
}
