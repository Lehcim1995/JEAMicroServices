package service;

import dao.UserDao;
import domain.User;

import javax.inject.Inject;
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
}
