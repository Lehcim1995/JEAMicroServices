package dao;

import domain.User;

import java.util.List;

public interface UserDao
{
    User addUser(User user);
    User addUser(String user);

    User getUser(int id);

    List<User> getUsers();

}
