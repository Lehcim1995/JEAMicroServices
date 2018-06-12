package dao;

import domain.Genre;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class GenreDaoImpl implements GenreDao
{

    @PersistenceContext(name = "gamePU")
    private EntityManager entityManager;

    @Override
    public Genre getGenre(int id) {
        return entityManager.createQuery("SELECT genre FROM Genre genre WHERE genre.id = :id", Genre.class)
                            .setParameter("id", id)
                            .getSingleResult();
    }

    @Override
    public Genre getGenre(String genre) {
        return entityManager.createQuery("SELECT genre FROM Genre genre WHERE genre.name = :name", Genre.class)
                            .setParameter("name", genre)
                            .getSingleResult();
    }

    @Override
    public List<Genre> getGenres() {
        return entityManager.createQuery("SELECT genre FROM Genre genre", Genre.class)
                            .getResultList();
    }

    @Override
    public Genre addGenre(Genre genre) {

        entityManager.persist(genre);

        return genre;
    }

    @Override
    public Genre addGenre(String genre) {

        Genre genre1 = new Genre(genre);

        return addGenre(genre1);
    }
}
