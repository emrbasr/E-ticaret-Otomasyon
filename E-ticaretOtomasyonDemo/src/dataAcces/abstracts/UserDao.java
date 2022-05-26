package dataAcces.abstracts;

import entities.concrete.User;

public interface UserDao {
    void add(User user);
    void delete(User user);


}
