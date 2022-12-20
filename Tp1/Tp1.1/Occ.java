public class Occ {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No Argument found !!");
    } else {
      for (int i = 1; i < args.length; i++) {
        if (args[0].equals(args[i])) {
          System.out.println("Found !! at position " + (i + 1));
        } else if ((i == args.length - 1) && !(args[0].equals(args[i]))) {
          System.out.println("Not Found !!");
        }
      }
    }
  }
}
