package dao;

import domain.Game;
import domain.Genre;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class GameDaoImpl implements GameDao
{

    @PersistenceContext(name = "gamePU")
    private EntityManager entityManager;

    @Override
    public Game getGame(int id) {
        return entityManager.createQuery("SELECT game FROM Game game WHERE game.id = :id", Game.class)
                            .setParameter("id", id)
                            .getSingleResult();
    }

    @Override
    public Game getGame(String title) {
        return entityManager.createQuery("SELECT game FROM Game game WHERE game.name = :title", Game.class)
                            .setParameter("title", title)
                            .getSingleResult();
    }

    @Override
    public List<Game> getGames() {
        return entityManager.createQuery("SELECT game FROM Game game", Game.class)
                            .getResultList();
    }

    @Override
    public List<Game> getGamesByGerne(Genre genre) {
        return entityManager.createQuery("SELECT game FROM Game game WHERE game.genres IN :genre", Game.class)
                            .setParameter("genre", genre)
                            .getResultList();
    }

    @Override
    public List<Game> getGamesByGerne(String genre) {
        return entityManager.createQuery("SELECT game FROM Game game WHERE game.genres IN (SELECT genre FROM Genre genre WHERE genre.name = :genre)", Game.class)
                            .setParameter("genre", genre)
                            .getResultList();
    }

    @Override
    public Game addGame(Game game) {

        entityManager.persist(game);

        return game;
    }

    @Override
    public Game addGame(
            String name,
            String publisher,
            String developers,
            float price)
    {
        Game game = new Game(name, publisher, developers, price);

        addGame(game);

        return game;
    }

    @Override
    public List<Game> addGames(List<Game> games) {

        games.forEach(game -> entityManager.persist(game));

        return games;
    }

    @Override
    public Game updateGame(
            Game old,
            Game newGame)
    {
        entityManager.merge(newGame);
        return newGame;
    }
}
