public class SommeCarresImpairs {

  public static void main(String[] args) {
    int sum = 0;
    int nbr = 0;
    if (args.length == 0) {
      System.out.println("No Argument !!");
    } else {
      for (int i = 1; i > 0; i++) {
        nbr += 1;
        sum += i * i;
        i += 1;
        if (nbr == Integer.parseInt(args[0])) {
          System.out.println(sum);
          System.exit(0);
        }
      }
    }
  }
}
