import java.util.Random;

public class Coureur extends Thread {
  private String name;

  public Coureur(String name) {
    this.name = name;
  }

  public void run() {
    try {
      int counter = 0, nbr = 0;
      //counter is for counting the distance that the runner ran
      //nbr is used to generate a number who will be used in miliseconds to take a break
      Random rand = new Random();
      while (counter <= 1000) {
        System.out.println(this.name + " ran " + counter + " meters");
        nbr = rand.nextInt(1001);
        sleep(nbr);
        counter += 100;
      }
      System.out.println("Congratulations " + this.name + " is arrived");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
