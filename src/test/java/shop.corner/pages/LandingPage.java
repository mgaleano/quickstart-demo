package shop.corner.pages;

import com.automato.configuration.AutRunConfig;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[data-testid=login-button")
    @AndroidFindBy(id = "com.cornershopapp.android.debug:id/buttonCompactLoginEmail")
    @iOSXCUITFindBy(accessibility = "LoginWithEmail")
    private WebElement loginBtn;

    @AndroidFindBy(accessibility = "Log in")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Log in')]")
    private WebElement logInTab;

    public LoginPage clickOnLogin() {
        loginBtn.click();
        if (AutRunConfig.isMobile()) {
            //wait.until(ExpectedConditions.elementToBeClickable(logInTab));
            logInTab.click();
        }
        return new LoginPage(driver);
    }
}
