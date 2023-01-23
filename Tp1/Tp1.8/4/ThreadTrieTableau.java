public class ThreadTrieTableau implements Runnable {
    Trieur trieur;

    public ThreadTrieTableau(Trieur trieur) {
        this.trieur = trieur;
    }
    public void run() {
        this.trieur.triTableau(this.trieur.t);
    }
}
