package busines.abstracts;

import entities.concrete.User;

public interface UserService {
    void add(User user);
    void checkPassport(User user);
    void checkEmail(User user);


}
