package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void updateUser(User user, int id);

    void addUser(User user);

    void deleteUser(int id);

    User getUser(int id);
}
