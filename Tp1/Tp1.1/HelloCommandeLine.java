public class HelloCommandeLine {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Hello");
    } else {
      for (int i = 0; i < args.length; i++) {
        System.out.println("Hello " + args[i]);
      }
    }
  }
}
/* Q: Que se passe-t-il si on ne donne pas d'argument sur la ligne de commande ?
 * R: S'il y'a pas d'argument sur la ligne de commande on obtinet une erreur d'execution car
 * le tableau args sera vide
 */
/* Q: Resoudre ce probleme a l'aide d'une condition */
/* Q: Modifier le programme pour que chaque nom donne sur la ligne de commande il affiche une ligne de salutation */
