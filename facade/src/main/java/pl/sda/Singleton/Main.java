package pl.sda.Singleton;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getCounter() + " " + singleton.getName());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getCounter() + " " + singleton.getName());
    }
}
