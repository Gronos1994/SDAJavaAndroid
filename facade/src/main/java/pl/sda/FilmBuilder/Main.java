package pl.sda.FilmBuilder;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        FilmBuilder filmBuilder = new FilmBuilder();
        Film film = filmBuilder.withTittle("Django").withPremiere(LocalDate.of(2013, 12, 13)).withDirector("Quentin Tarantino").withProduction("USA").withType("Western").build();
        System.out.println(film.toString());
    }
}
