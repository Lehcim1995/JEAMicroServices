package dao;

import domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@Stateless
public class UserDaoImpl implements UserDao
{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User addUser(User user)
    {

        entityManager.persist(user);

        return user;
    }

    @Override
    public User addUser(String user)
    {

        User u = new User(user);

        return addUser(u);
    }

    @Override
    public User getUser(int id)
    {
        return entityManager.createQuery("SELECT user FROM User user WHERE user.id = :id", User.class)
                            .setParameter("id", id)
                            .getSingleResult();
    }

    @Override
    public List<User> getUsers()
    {
        return entityManager.createQuery("SELECT user FROM User user", User.class)
                            .getResultList();
    }

    @Override
    public List<User> getUsersByGame(int gameId)
    {
        return entityManager.createQuery("SELECT user FROM User user WHERE user.games in :id", User.class)
                            .setParameter("id", Arrays.asList(gameId))
                            .getResultList();
    }

    @Override
    public User updateUser(User user) {

        return entityManager.merge(user);
    }
}
