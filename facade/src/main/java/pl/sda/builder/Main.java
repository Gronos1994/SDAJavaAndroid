package pl.sda.builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAddress address = new PersonAddress();
        address.setCity("Poznań");
        address.setStreet("Baraniaka 34");
        address.setPostalCode("91-200");
        Person person = personBuilder.withFirstName("Jaś").withLastName("Kowalski").withPesel("94014871236").withPersonAddress(address).build();
        System.out.println(person.toString());
    }

}
