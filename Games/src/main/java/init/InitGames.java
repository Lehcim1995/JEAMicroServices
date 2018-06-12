package init;

import domain.Game;
import service.GameService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

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
        gameService.addGame(new Game("game", "publisher", "developer", 5));
        gameService.addGame(new Game("game1", "publisher", "developer", 5));
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
