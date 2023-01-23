import java.util.Scanner;

public class TestPoint {

  public static Point createPoint(Scanner sc) {
    System.out.println("Renseigner l'abssiste x");
    double x = sc.nextDouble();
    System.out.println("Renseigner l'ordonnee x");
    double y = sc.nextDouble();

    return new Point(x, y);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Point p1 = createPoint(sc);
    System.out.println(p1.toString());
    //deplacer un point
    System.out.println("deplacer p1 en \n : ");
    Point p11 = createPoint(sc);
    p1.deplacer(p11.x, p11.y);
    System.out.println(p1.toString());
    //translation
    System.out.println("translation de p1 \n :");
    Point p12 = createPoint(sc);
    p1.translater(p12.x, p12.y);
    System.out.println(p1.toString());

    //calcul de distance
    System.out.println(
      "distance entre " +
      p1.toString() +
      " et " +
      p12.toString() +
      " et p11 : " +
      Point.distance(p1.x, p1.y, p12.x, p12.y)
    );
  }
}
