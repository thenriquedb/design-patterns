package creational.singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // new not allowed outside the class
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
