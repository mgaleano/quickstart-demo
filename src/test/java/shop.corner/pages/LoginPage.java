package shop.corner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "input[data-testid=login-button]")
    private WebElement loginButton;

    public StoresGridPage loginUser(String username, String password) {

        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        return new StoresGridPage(driver);
    }
}
