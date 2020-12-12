package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //        Singleton instance3 = new Singleton; error

        System.out.println("instance1 == instance2 is " + instance1.equals(instance2));;
    }
}
