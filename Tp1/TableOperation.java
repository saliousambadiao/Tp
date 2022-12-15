import java.util.Random;

public class TableOperation {

  /* This function allow us to fill a table */
  public static void toFill(int[] t) {
    System.out.println("******** Filling of the table ********");
    int LESS = -100, HIGHER = 100;
    Random vRandom = new Random();
    for (int i = 0; i < t.length; i++) {
      int value = vRandom.nextInt(HIGHER - LESS) + LESS;
      t[i] = value;
    }
    System.out.println("******** Filling of the table succes ********");
  }

  /* For a verification let's display our table to see if the filling goes well */
  /* This function browses and display the elements of the table */
  public static void toDisplay(int[] t) {
    System.out.println("******** Displaying of the table ********");
    for (int i = 0; i < t.length; i++) {
      System.out.println("\t" + t[i] + "\t");
    }
    System.out.println("******** Displaying of the table succes ********");
  }

  /* This function return the sum of all the elements into the table */
  public static int theSum(int[] t) {
    int sum = 0;
    for (int i = 0; i < t.length; i++) {
      sum += t[i];
    }
    return sum;
  }

  /* This function return the minimum of the elements into the table */
  public static int theMinimum(int[] t) {
    int min = t[0];
    for (int i = 0; i < t.length; i++) {
      if (t[i] < min) min = t[i];
    }
    return min;
  }

  /* This function return the maximum of the elements into the table */
  public static int theMaximum(int[] t) {
    int max = t[0];
    for (int i = 0; i < t.length; i++) {
      if (t[i] > max) max = t[i];
    }
    return max;
  }

  /* This function give us the difference between the maximum and the minimum of the elements into the table  */
  public static int theDifference(int[] t) {
    int diff = theMaximum(t) - theMinimum(t);
    return diff;
  }

  /* This function allow us to sort the elements into the table */
  public static void toSort(int[] t) {
    System.out.println(" Sort the table ");
    for (int i = 0; i < t.length; i++) {
      for (int j = i; j < t.length; j++) {
        if (t[i] > t[j]) {
          int temp = t[i];
          t[i] = t[j];
          t[j] = temp;
        }
      }
    }
    System.out.println(" Sort the table succes ");
    System.out.println("******** Verification ******** ");
    toDisplay(t);
  }

  /* This function return true if the both of the tables contain the same elements at the same index and false otherwise */
  public static boolean equality1(int[] t1, int[] t2) {
    boolean result1 = true;
    for (int i = 0; i < t1.length; i++) {
      if (t1[i] != t2[i]) {
        result1 = false;
        return result1;
      }
    }
    return result1;
  }

  /* This function return true if tables contain the same elements and false otherwise  */
  public static boolean equality2(int[] t1, int[] t2) {
    boolean result2 = true;
    for (int i = 0; i < t1.length; i++) {
      for (int j = 0; j < t2.length; j++) {
        if (t1[i] != t2[j]) {
          result2 = false;
          return result2;
        }
      }
    }
    return result2;
  }

  /* Let's do a test of all these functions */
  public static void main(String[] args) {
    int tab[] = new int[10];
    toFill(tab);
    toDisplay(tab);
    System.out.println(
      "The sum of the elements into the table is: " + theSum(tab)
    );
    theMinimum(tab);
    theMaximum(tab);
    theDifference(tab);
    toSort(tab);
    int tab2[] = new int[10];
    toFill(tab2);
    System.out.println("************* Display the second table ***********");
    toDisplay(tab2);
    boolean egalite = equality1(tab, tab2);
    if (egalite) {
      System.out.println("The tables are the same");
    } else {
      System.out.println("The tables are'nt the same");
    }
    boolean equivalence = equality2(tab, tab2);
    if (equivalence) {
      System.out.println(" The tables have the same contain");
    } else {
      System.out.println("The tables have'nt the same contain");
    }
  }
}
