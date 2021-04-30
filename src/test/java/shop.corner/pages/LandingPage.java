package shop.corner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[data-testid=login-button")
    private WebElement loginBtn;

    public LoginPage clickOnLogin() {
        loginBtn.click();
        return new LoginPage(driver);
    }
}
