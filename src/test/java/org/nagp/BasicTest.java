package org.nagp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

  @Test
  public void testCompareNumbers() {
    Basic basic = new Basic();
    Assert.assertEquals(basic.compareNumbers(1,1),0, "numbers are not equal");
  }
}