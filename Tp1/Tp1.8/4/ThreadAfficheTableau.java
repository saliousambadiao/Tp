public class ThreadAfficheTableau implements Runnable {
  Trieur trieur;

  public ThreadAfficheTableau(Trieur trieur) {
    this.trieur = trieur;
  }

  public void run() {
    this.trieur.displayAfter();
  }
}
