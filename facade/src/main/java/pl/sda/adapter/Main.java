package pl.sda.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(carToPersonAdapter);

        for (Person personFromList : personList) {
            personFromList.move();
            personFromList.say();
        }
    }


}
