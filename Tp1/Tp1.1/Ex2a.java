public class Ex2a {

  static void f(int[] a, int i, int k) {
    a[i] = k;
  }

  public static void printtab(int[] tab) {
    for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    int[] t = { 1, 2, 3, 4, 5, 6 };
    int[] u;
    int[] v;

    printtab(t);
    f(t, 2, 12);
    printtab(t);
    u = t;
    f(u, 1, 0);
    printtab(u);
    printtab(t);
    v = (int[]) t.clone();
    f(v, 0, 0);
    printtab(v);
    printtab(t);
  }
}
/* Le programme produit ceci:
1 2 3 4 5 6 
1 2 12 4 5 6 
1 0 12 4 5 6 
1 0 12 4 5 6 
0 0 12 4 5 6 
1 0 12 4 5 6
*/
