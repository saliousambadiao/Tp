import java.util.Scanner;

public class TestComplexe {

  public static Complexe createComplexe(Scanner sc) {
    System.out.println("Renseigner la partie reelle ");
    double x = sc.nextDouble();
    System.out.println("Renseigner la partie imaginaire");
    double y = sc.nextDouble();

    return new Complexe(x, y);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Complexe cmp = createComplexe(sc);
    System.out.println(cmp.toString());
    //addition
    Complexe tmp = createComplexe(sc);
    cmp.ajouter(tmp);
    System.out.println(cmp.toString());

    //soustraction
    tmp = createComplexe(sc);
    cmp.soustraire(tmp);
    System.out.println(cmp.toString());
  }
}
