package softwaretest.qajava.homework;

public class PointMath {

  public static void main(String[] args) {
Point p1 = new Point(1,2);
Point p2 = new Point(2,4);
    double distance = distance(p1,p2);
    System.out.println(distance);

Point p3dist = new Point(p1,p2);
    System.out.println(p3dist.distance2());

Point p3 = new Point(2,3);
    System.out.println(p3.distance3(p1));
  }

  public static double distance(Point p1, Point p2){
    double res = Math.sqrt(Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2));
    return res;
  }
}
