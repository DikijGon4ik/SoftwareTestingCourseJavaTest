package sotfwaretest.qajava.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;
import sotfwaretest.qajava.sandbox.Square;

public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }

}
