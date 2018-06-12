package service;

import dao.GameDao;
import dao.GenreDao;
import domain.Game;
import domain.Genre;

import javax.inject.Inject;
import java.util.List;

public class GameService
{
    @Inject
    private GameDao gameDao;

    @Inject
    private GenreDao genreDao;

    public Genre getGenre(int id) {
        return genreDao.getGenre(id);
    }

    public Genre getGenre(String genre) {
        return genreDao.getGenre(genre);
    }

    public List<Genre> getGenres() {
        return genreDao.getGenres();
    }

    public Genre addGenre(Genre genre) {
        return genreDao.addGenre(genre);
    }

    public Genre addGenre(String genre) {
        return genreDao.addGenre(genre);
    }

    public Game getGame(int id) {
        return gameDao.getGame(id);
    }

    public Game getGame(String title) {
        return gameDao.getGame(title);
    }

    public List<Game> getGames() {
        return gameDao.getGames();
    }

    public List<Game> getGamesByGerne(Genre genre) {
        return gameDao.getGamesByGerne(genre);
    }

    public List<Game> getGamesByGerne(String genre) {
        return gameDao.getGamesByGerne(genre);
    }

    public Game addGame(Game game) {
        return gameDao.addGame(game);
    }

    public Game addGame(
            String name,
            String publisher,
            String developers,
            float price)
    {
        return gameDao.addGame(name, publisher, developers, price);
    }

    public List<Game> addGames(List<Game> games) {
        return gameDao.addGames(games);
    }

    public Game updateGame(
            Game old,
            Game newGame)
    {
        return gameDao.updateGame(old, newGame);
    }
}
