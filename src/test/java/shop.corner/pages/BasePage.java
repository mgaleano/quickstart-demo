package shop.corner.pages;

import com.automato.configuration.AutRunConfig;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;


public class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;
  protected WebDriverWait waitLong;
  protected FluentWait fluentWait;

  /**
   * This BasePage is intended to be used as parent class of all the PageObject classes that are
   * defined in order to share the same driver across all instances and to provide common features
   * that can be used in any PageObject.
   *
   * @param driver instance
   */
  public BasePage(WebDriver driver) {
    this.driver = driver;
    if (AutRunConfig.isMobile()) {
      PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(5)), this);
    } else {
      PageFactory.initElements(driver, this);
    }
    wait = new WebDriverWait(driver, 8);
    waitLong = new WebDriverWait(driver, 15);
    fluentWait =
        new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofMillis(500));
  }
}
