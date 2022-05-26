import busines.abstracts.UserService;
import busines.concrete.UserManager;
import dataAcces.abstracts.UserDao;
import dataAcces.concrete.HibernateUserDao;
import entities.concrete.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("emre","başar","blabla","123456");

        UserService userService = new UserManager(new HibernateUserDao());
        userService.checkPassport(user);
        userService.add(user);

    }
}
