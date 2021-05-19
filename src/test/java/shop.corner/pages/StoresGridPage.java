package shop.corner.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoresGridPage extends BasePage {

    public StoresGridPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.account")
    @AndroidFindBy(id = "com.cornershopapp.android.debug:id/imageAccount")
    @iOSXCUITFindBy(accessibility = "Account")
    private WebElement accountButton;

    public boolean isAccountButtonDisplayed() {
        return accountButton.isDisplayed();
    }
}
