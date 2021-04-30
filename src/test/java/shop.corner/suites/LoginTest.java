package shop.corner.suites;

import com.automato.configuration.AutConfiguration;
import com.automato.driver.WebDriverHelper;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shop.corner.pages.LandingPage;
import shop.corner.pages.LoginPage;
import shop.corner.pages.StoresGridPage;

public class LoginTest {

  private WebDriver driver;

  @BeforeMethod
  public void setupDriver() {
    driver = WebDriverHelper.getWebDriver();
    // Step 2
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void verifyLoginV1() {
    // driver.get("https://web.superpal.com/");
    driver.get(AutConfiguration.getBaseUrl());

    // Step 2
    WebElement loginButton = driver.findElement(By.cssSelector("button[data-testid=login-button"));
    loginButton.click();

    // Step 3
    WebElement emailInput = driver.findElement(By.id("email"));
    emailInput.sendKeys("marcos.galeano@mail.com");
    WebElement passwordInput = driver.findElement(By.id("password"));
    passwordInput.sendKeys("mypassword");
    WebElement logInButton = driver.findElement(By.cssSelector("[data-testid=login-button]"));
    logInButton.click();

    // Step 4
    WebElement accountButton = driver.findElement(By.cssSelector("button.account"));
    Assert.assertTrue(accountButton.isDisplayed(), "Account button is not displayed");
  }

  // Step 5
  @Test
  public void verifyLoginV2() {
    driver.get("https://web.superpal.com/");

    LandingPage landingPage = new LandingPage(driver);
    LoginPage loginPage = landingPage.clickOnLogin();
    StoresGridPage storesGridPage = loginPage.loginUser("marcos.galeano@mail.com", "mypassword");

    Assert.assertTrue(storesGridPage.isAccountButtonDisplayed(), "Account button is not displayed");
  }

  // Step 2
  @AfterMethod
  public void quitDriver() {
    driver.quit();
  }
}
