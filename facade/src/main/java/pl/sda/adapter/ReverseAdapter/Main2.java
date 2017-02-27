package pl.sda.adapter.ReverseAdapter;

import pl.sda.adapter.*;

import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        PersonToCarAdapter personToCarAdapter = new PersonToCarAdapter(person);

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(personToCarAdapter);

        for (Car carFromList : carList) {
            carFromList.drive();
            carFromList.horn();
        }


    }
}
