package dao;

import domain.Game;
import domain.Genre;

import java.util.List;

public interface GameDao
{
    Game getGame(int id);
    Game getGame(String title);

    List<Game> getGames();
    List<Game> getGamesByGerne(Genre genre);
    List<Game> getGamesByGerne(String genre);

    Game addGame(Game game);
    Game addGame(String name,
                 String publisher,
                 String developers,
                 float price);

    List<Game> addGames(List<Game> games);

    Game updateGame(Game old, Game newGame);
}
