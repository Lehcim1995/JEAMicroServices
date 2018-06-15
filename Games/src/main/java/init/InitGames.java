package init;

import domain.Game;
import domain.Genre;
import service.GameService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.Arrays;

@Startup
@Singleton
public class InitGames
{
    @Inject
    private GameService gameService;

    public InitGames() {
    }

    @PostConstruct
    public void init()
    {
        Genre genre = new Genre("custom1");
        Genre genre1 = new Genre("custom2");
        Genre genre2 = new Genre("custom3");
        Game game1 = new Game("game1", "publisher", "developer", 5);
        game1.setGenres(Arrays.asList(genre, genre1));

        Game game2 = new Game("game2", "publisher", "developer", 5);
        game2.setGenres(Arrays.asList(genre1, genre2));

        gameService.addGame(new Game("game", "publisher", "developer", 5));
        gameService.addGame(game1);
        gameService.addGame(game2);
        gameService.addGame(new Game("game2", "publisher", "developer", 5));
        gameService.addGame(new Game("game3", "publisher", "developer", 5));
        gameService.addGame(new Game("game4", "publisher", "developer", 5));
        gameService.addGame(new Game("game5", "publisher", "developer", 5));
        gameService.addGame(new Game("game6", "publisher", "developer", 5));

        gameService.addGenre("genre1");
        gameService.addGenre("genre2");
        gameService.addGenre("genre3");
        gameService.addGenre("genre4");
        gameService.addGenre("genre5");
        gameService.addGenre("genre6");
    }
}
