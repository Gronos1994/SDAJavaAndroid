package pl.sda.Singleton;

/**
 * Created by RENT on 2017-02-25.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
private static int counter = 0;

    public  int getCounter() {
        return counter;
    }

    private Singleton(){
        counter++;

    }

    public static Singleton getInstance() {
        return instance;
    }
    public String getName(){
        return "Singleton";
    }
}
