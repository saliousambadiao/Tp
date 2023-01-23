public class Point {
  /* attributs */
  public double x;
  public double y;

  /* constructors */
  public Point() {}

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point point) {
    this.x = point.x;
    this.y = point.y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double distance(double x, double y) {
    return 0.000;
  }

  public double distance(Point point) {
    return 0.000;
  }

  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }

  public void deplacer(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void translater(double dx, double dy) {
    this.x += dx;
    this.y += dy;
  }

  public String toString() {
    return "(" + this.x + " , " + this.y + " )";
  }
}
