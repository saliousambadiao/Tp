import java.util.Scanner;

public class TestTrieur {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int lgth;
    int[] tabt;
    System.out.print(" Enter the length of the array: ");
    lgth = scanner.nextInt();
    tabt = new int[lgth];
    for (int i = 0; i < lgth; i++) {
      System.out.print("Enter element at position n°" + (i + 1) + ": ");
      tabt[i] = scanner.nextInt();
    }
    Trieur trieur = new Trieur(tabt);
    ThreadTrieTableau ttt = new ThreadTrieTableau(trieur);
    ThreadAfficheTableau tat = new ThreadAfficheTableau(trieur);

    Thread thread1 = new Thread(ttt);
    Thread thread2 = new Thread(tat);

    thread1.start();
    thread2.start();
    scanner.close();
  }
}
