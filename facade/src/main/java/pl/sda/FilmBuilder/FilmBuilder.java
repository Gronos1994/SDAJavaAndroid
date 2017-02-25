package pl.sda.FilmBuilder;

import pl.sda.builder.Person;

import java.time.LocalDate;

/**
 * Created by RENT on 2017-02-25.
 */
public class FilmBuilder {
    private Film film;

    public FilmBuilder() {
        film = new Film();
    }

    public FilmBuilder withTittle (String tittle) {
        film.setTittle(tittle);
        return this;
    }
    public FilmBuilder withDirector (String director) {
        film.setDirector(director);
        return this;
    }
    public FilmBuilder withType (String type) {
        film.setType(type);
        return this;
    }
    public FilmBuilder withProduction (String production) {
        film.setProduction(production);
        return this;
    }
    public FilmBuilder withPremiere (LocalDate premiere) {
        film.setPremiere(premiere);
        return this;
    }
    public Film build() {
        return film;
    }
}
