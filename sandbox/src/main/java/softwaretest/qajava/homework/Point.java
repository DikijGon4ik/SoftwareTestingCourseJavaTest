package softwaretest.qajava.homework;

public class Point {
  double x;
  double y;
  Point p1;
  Point p2;


  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public Point(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public double distance2(){
      double res = Math.sqrt(Math.pow((this.p2.x-this.p1.x),2) + Math.pow((this.p2.y-this.p1.y),2));
      return res;
    }

    public double distance3(Point ppp){
    double res = Math.sqrt(Math.pow((this.x-ppp.x),2) + Math.pow((this.y-ppp.y),2));
    return res;
    }
}
