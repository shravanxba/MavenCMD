package com.lti.testdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparision {
  @Test
  public void intComparision() {
	  Assert.assertTrue(5>4);
  }
}
