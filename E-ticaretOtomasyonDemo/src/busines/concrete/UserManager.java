package busines.concrete;

import busines.abstracts.UserService;
import dataAcces.abstracts.UserDao;
import entities.concrete.User;


public class UserManager implements UserService {
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    @Override
    public void add(User user) {
        if (user.getName().length()>=2){
            System.out.println("girilen isim uygundur ");
            System.out.print("Aramıza Hoşgeldiniz: "+user.getName()+" "+user.getLastName());
        }
        else {
            System.out.println("Girilen isim çok kısa");
        }


    }
    @Override
    public void checkPassport(User user) {
        if (user.getPassport().length()>=6){
            System.out.println("Şifreniz oluşturuldu ");
        }
        else {
            System.out.println("Şifrenizi en az 6 karakter giriniz");
        }
    }

    @Override
    public void checkEmail(User user) {

    }
}
