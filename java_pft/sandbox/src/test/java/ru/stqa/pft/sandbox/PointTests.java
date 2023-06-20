package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class PointTests {
  public void testPoint() {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(5, 6);

    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);

    p1 = new Point(0, 0);
    p2 = new Point(0, 0);

    Assert.assertEquals(p1.distance(p2), 0.0);
  }
}
