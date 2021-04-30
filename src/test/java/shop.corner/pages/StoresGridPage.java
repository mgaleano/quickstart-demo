package shop.corner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoresGridPage extends BasePage {

    public StoresGridPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.account")
    private WebElement accountButton;

    public boolean isAccountButtonDisplayed() {
        return accountButton.isDisplayed();
    }
}
