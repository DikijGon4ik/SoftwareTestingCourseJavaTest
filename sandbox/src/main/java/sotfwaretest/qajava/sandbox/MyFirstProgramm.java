package sotfwaretest.qajava.sandbox;

import org.w3c.dom.css.Rect;

public class MyFirstProgramm {

 public static void main(String[] args) {
    hello("world");
  Square square = new Square(5);

   Rectangle rectangle = new Rectangle(2,3);

   System.out.println(2+2);
   double l = 5;

   System.out.println("Площадь квадрата со стороной " + square.l + " = " + square.area());
   System.out.println("Площадь прямоугольника со сторонами " + rectangle.a + " и " + rectangle.b + " = " + rectangle.area());
 }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

}


