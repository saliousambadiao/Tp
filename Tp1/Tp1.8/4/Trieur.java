public class Trieur {
  public int[] t;

  public Trieur(int[] t) {
    this.t = t;
  }

  public synchronized int[] triTableau(int[] t) {
    int size = t.length;
    displayBefore();
    for (int i = 0; i < size; i++) {
      int index = i;
      for (int j = i + 1; j < size; j++) {
        if (t[j] < t[index]) index = j;
      }
      exchange(t, index, i);
    }
    return t;
  }

  public void exchange(int[] t, int i, int j) {
    int tmp = t[i];
    t[i] = t[j];
    t[j] = tmp;
  }

  public void displayBefore() {
    System.out.print("The array  before  sort: ");
    for (int k : this.t) System.out.print(k + " ");
    System.out.println();
  }

  public synchronized void displayAfter() {
    System.out.print("The array after sort is: ");
    for (int e : this.t) System.out.print(e + " ");
    System.out.println();
  }
}
