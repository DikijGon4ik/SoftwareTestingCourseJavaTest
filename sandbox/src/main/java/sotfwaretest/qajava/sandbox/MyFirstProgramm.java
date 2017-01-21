package sotfwaretest.qajava.sandbox;

public class MyFirstProgramm {

 public static void main(String[] args) {
    hello("world");

   System.out.println(2+2);
   double l = 5;
   int a = 2;
   int b = 3;
   System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
   System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
 }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l){
    return l*l;
  }

  public  static double area(double a, double b){
    return a*b;
  }
}


