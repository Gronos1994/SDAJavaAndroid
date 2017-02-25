package pl.sda.pl.sda.observer;

/**
 * Created by RENT on 2017-02-25.
 */
public class Observer {
    public void react(int value) {
        System.out.println("Wartość" + " " + value + " " + "została zmieniona na " + Math.abs(value));
    }
}
