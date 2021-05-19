package shop.corner.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    @AndroidFindBy(id ="com.cornershopapp.android.debug:id/editEmailLogin")
    @iOSXCUITFindBy(accessibility = "Email")
    private WebElement emailInput;

    @FindBy(id = "password")
    @AndroidFindBy(id = "com.cornershopapp.android.debug:id/editPasswordLogin")
    @iOSXCUITFindBy(accessibility = "Password")
    private WebElement passwordInput;

    @FindBy(css = "input[data-testid=login-button]")
    @AndroidFindBy(id = "com.cornershopapp.android.debug:id/buttonLogin")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
    private WebElement loginButton;

    public StoresGridPage loginUser(String username, String password) {
        emailInput.click();
        emailInput.sendKeys(username);
        passwordInput.click();
        passwordInput.sendKeys(password);
        loginButton.click();

        return new StoresGridPage(driver);
    }
}
