package org.nagp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

  @Test
  public void testGetMessage() {
    App app1 = new App();
    App app2 = new App();
    Assert.assertEquals(app1.getMessage(), app2.getMessage(),"Messages are not equal");
  }
}