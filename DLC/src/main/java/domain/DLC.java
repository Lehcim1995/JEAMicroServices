package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DLC
{
    @Id
    @GeneratedValue
    private int id;
    private String dlcName;
    private int game;

    public DLC(
            String dlcName,
            int game)
    {
        this.dlcName = dlcName;
        this.game = game;
    }

    public DLC() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDlcName() {
        return dlcName;
    }

    public void setDlcName(String dlcName) {
        this.dlcName = dlcName;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }
}
