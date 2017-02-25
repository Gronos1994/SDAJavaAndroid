package pl.sda.FilmBuilder;

import java.time.LocalDate;

/**
 * Created by RENT on 2017-02-25.
 */
public class Film {
    private String tittle;
    private String director;
    private String type;
    private String production;
    private LocalDate premiere;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public LocalDate getPremiere() {
        return premiere;
    }

    public void setPremiere(LocalDate premiere) {
        this.premiere = premiere;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tittle='" + tittle + '\'' +
                ", director='" + director + '\'' +
                ", type='" + type + '\'' +
                ", production='" + production + '\'' +
                ", premiere='" + premiere + '\'' +
                '}';
    }
}
