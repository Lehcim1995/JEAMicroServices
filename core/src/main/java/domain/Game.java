package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Game
{
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String publisher;
    private String Developers;

    private float price;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Genre> genres;

    public Game(
            String name,
            String publisher,
            String developers,
            float price)
    {
        this.name = name;
        this.publisher = publisher;
        Developers = developers;
        this.price = price;

        genres = new ArrayList<>();
    }

    public Game(
            String name,
            String publisher,
            String developers,
            float price,
            List<Genre> genres)
    {
        this.name = name;
        this.publisher = publisher;
        Developers = developers;
        this.price = price;
        this.genres = genres;
    }

    public Game() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDevelopers() {
        return Developers;
    }

    public void setDevelopers(String developers) {
        Developers = developers;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
