public class Tri {

  public static void bubble(int[] t) {
    for (int i = 0; i < t.length - 1; i++) {
      for (int j = 0; j < t.length - i - 1; j++) {
        if (t[j] < t[j + 1]) {
          t[j] = t[j] + t[j + 1];
          t[j + 1] = t[j] - t[j + 1];
          t[j] = t[j] - t[j + 1];
        }
      }
    }
    for (int i = 0; i < t.length; i++) {
      System.out.println(t[i]);
    }
  }

  public static void main(String[] args) {
    int[] tab = { 2, 6, 9, 2, 4, 98, 43, 23, 12, 67, 87, 90 };
    bubble(tab);
  }
}
