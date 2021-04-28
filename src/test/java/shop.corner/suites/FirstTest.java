package shop.corner.suites;

import org.testng.Assert;
import org.testng.annotations.Test;
import shop.corner.dataprovider.QuickstartDataProvider;

public class FirstTest {

  @Test(dataProvider = "test", dataProviderClass = QuickstartDataProvider.class)
  public void test() {
    Assert.assertTrue(true);
  }
}
