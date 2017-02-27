package pl.sda.adapter.ReverseAdapter;

import pl.sda.adapter.Car;
import pl.sda.adapter.Person;

/**
 * Created by RENT on 2017-02-27.
 */
public class PersonToCarAdapter implements Car {
    private Person person;

    public PersonToCarAdapter(Person person) {
        this.person = person;
    }

    @Override
    public void drive() {
        person.move();

    }

    @Override
    public void horn() {
        person.say();
    }
}
