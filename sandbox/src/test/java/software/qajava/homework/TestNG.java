package software.qajava.homework;
import org.testng.Assert;
import org.testng.annotations.Test;
import softwaretest.qajava.homework.Point;

public class TestNG {

  @Test
  public void testDistance3(){
    Point p1 = new Point(1,2);
    Point p2 = new Point(2,4);
    Assert.assertEquals(p2.distance3(p1),2.23606797749979);
  }
  @Test
  public void testDistance2(){
    Point p1 = new Point(1,2);
    Point p2 = new Point(2,4);
    Point p3 = new Point(p1,p2);
    Assert.assertEquals(p3.distance2(),2.23606797749979);
  }
}
