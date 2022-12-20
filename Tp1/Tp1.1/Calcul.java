public class Calcul {

  public static int Somme(int[] t) {
    int somme = 0;
    for (int i = 0; i < t.length; i++) {
      somme += t[i];
    }
    return somme;
  }

  public static double Produit(int[] t) {
    if (t.length == 0) {
      return 0;
    }
    double produit = 1;
    for (int i = 0; i < t.length; i++) {
      produit *= t[i];
    }
    return produit;
  }

  public static double Moyenne(int[] t) {
    double moyenne = 0;
    if (t.length != 0) {
      moyenne = Somme(t) / t.length;
    } else {
      System.out.println("Divion par zero impossible !!");
    }
    return moyenne;
  }

  public static void main(String[] args) {
    int[] tab = { 1, 23, 12, -4, 6, 89, 2 };
    //int[] tab = {};
    int sum = Somme(tab);
    double prod = Produit(tab);
    double moy = Moyenne(tab);
    System.out.println("La somme des elements du tableau est: " + sum);
    System.out.println("Le produit des elements du tableau est: " + prod);
    System.out.println("La moyenne des elements du tableau est: " + moy);
  }
}
