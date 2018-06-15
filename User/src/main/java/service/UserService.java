package service;

import dao.UserDao;
import domain.User;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService
{
    @Inject
    private UserDao userDao;

    public User addUser(User user) {
        return userDao.addUser(user);
    }

    public User addUser(String user) {
        return userDao.addUser(user);
    }

    public User getUser(int id) {
        return userDao.getUser(id);
    }

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public List<User> getUsersByGame(int gameId) {
        return userDao.getUsersByGame(gameId);
    }

    public User addGames(User u, Integer... gameIds)
    {
        u.setGames(Arrays.asList(gameIds));

        userDao.updateUser(u);

        return u;
    }
}
