public class Main {

    public static void main(String[] args) {
        Singleton sin1 = Singleton.getInstance();
        Singleton sin2 = Singleton.getInstance();

        if (sin1 == sin2) {
            System.out.println("Those are the same objects");
        }
    }
    
}
