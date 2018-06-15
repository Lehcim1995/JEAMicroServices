package domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User
{
    @Id
    @GeneratedValue
    private int id;

    private String username;

    @ElementCollection
    private List<Integer> games;

    public User(String username) {
        this.username = username;
        games = new ArrayList<>();
    }

    public User(
            String username,
            List<Integer> games)
    {
        this.username = username;
        this.games = games;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Integer> getGames() {
        return games;
    }

    public void setGames(List<Integer> games) {
        this.games = games;
    }
}
