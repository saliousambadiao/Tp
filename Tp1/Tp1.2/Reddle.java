import java.util.Random;
import java.util.Scanner;

public class Reddle {

  public static int randInt(int min, int max) {
    Random rand = new Random();
    int randomValue = rand.nextInt((max - min) + 1) + min;
    return randomValue;
  }

  public static void main(String[] args) {
    int min = 0, max = 100;
    do {
      int number = randInt(min, max);
      System.out.println(" Is " + number + " the number ?");
      System.out.println(" You can answer by 'high', 'less' or 'yes'");
      Scanner scanner = new Scanner(System.in);
      String response = scanner.next();
      System.out.println(response);
      if (response.equals("high")) {
        min = (number + 1) > max ? number : number + 1;
      } else if (response.equals("less")) {
        max = (number - 1) > min ? number - 1 : number;
      } else if (response.equals("yes")) {
        System.out.println("Nice Game Won :)");
        scanner.close();
        System.exit(0);
      } else {
        System.out.println("Unknown answer");
      }
    } while (true);
  }
}
