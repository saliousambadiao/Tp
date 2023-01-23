public class TestCoureur {
    public static void main(String[] args) {
        System.out.println("Passage aux : ");
        Coureur j = new Coureur("Margaret");
        Coureur p = new Coureur("Irene");
        j.start();
        p.start();
        try {
            j.join();
            p.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Coureur k = new Coureur("Janet");
        k.start();
    }
}
