import java.util.Scanner;

public class Palindromic {

  public static boolean palindromic(String word) {
    word = word.toLowerCase();
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(" Give the word or the number that you wanna test !!");
    try (Scanner scanner = new Scanner(System.in)) {
      String word = scanner.next();
      boolean response1 = palindromic(word);
      String res = (response1 == true)
        ? ("YES " + word + " is a palindromic")
        : ("NO " + word + " is not a palindromic");
      System.out.println(res);
      /* An alternative is to use the following lines with the classic if condition */
      // if (response1) {
      //   System.out.println(" Yes " + word + " is a palindromic");
      // } else {
      //   System.out.println(" No " + word + " is not a palindromic");
      // }
    }
  }
}
