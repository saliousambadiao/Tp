public class Calc {

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Not Enougth Arguments or No Argument !!");
    } else if (args.length > 3) {
      System.out.println("Too many Arguments !!");
    } else {
      if (args[1].equals("+")) {
        System.out.println(
          Integer.parseInt(args[0]) + Integer.parseInt(args[2])
        );
      } else if (args[1].equals("-")) {
        System.out.println(
          Integer.parseInt(args[0]) - Integer.parseInt(args[2])
        );
      } else if (args[1].equals("x")) {
        System.out.println(
          Integer.parseInt(args[0]) * Integer.parseInt(args[2])
        );
      } else if (args[1].equals("/")) {
        System.out.println(
          Integer.parseInt(args[0]) / Integer.parseInt(args[2])
        );
      } else {
        System.out.println("Unknown Operator");
      }
    }
  }
}
