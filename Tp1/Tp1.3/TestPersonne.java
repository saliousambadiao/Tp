import java.util.Scanner;

public class TestPersonne {

  public static String setNom(Scanner sc) {
    System.out.println("votre nom : \t");
    String nom = sc.next();
    return nom;
  }

  public static String setPrenom(Scanner sc) {
    System.out.println("votre prenom : \t");
    Scanner scanner = new Scanner(System.in);
    String nickName = scanner.nextLine();
    return nickName;
  }

  public static int setAge(Scanner sc) {
    int age = 0;
    do {
      System.out.println("votre age : \t");
      age = sc.nextInt();
    } while (age <= 0 || age >= 130);
    return age;
  }

  public static String setSexe(Scanner sc) {
    String sexe = "";
    do {
      System.out.println("votre sexe : \t");
      sexe = sc.next();
    } while (
      (!(sexe.toUpperCase().equals("FEMININ"))) &&
      (!(sexe.toUpperCase().equals("MASCULIN"))) &&
      (!(sexe.toUpperCase().equals("M"))) &&
      (!(sexe.toUpperCase().equals("F")))
    );
    if (sexe.equals("M") || sexe.equals("m")) {
      sexe = "Masculin";
    } else if (sexe.equals("F") || sexe.equals("f")) {
      sexe = "Feminin";
    }
    String lSexe = sexe.toUpperCase();
    return lSexe;
  }

  public static Personne initPersonne(Scanner sc) {
    String fName = setNom(sc);
    String lName = setPrenom(sc);
    int age = setAge(sc);
    String sexe = setSexe(sc);

    return new Personne(fName, lName, age, sexe);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Personne person = initPersonne(in);

    System.out.println(person.toString());
  }
}
