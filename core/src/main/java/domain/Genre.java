package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre
{
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Genre(
            String name)
    {
        this.name = name;
    }

    public Genre() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
