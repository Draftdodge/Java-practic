package HW_OOP_3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser((new User("Артем", "Иванов", 23)))
                .addUser((new User("Иван", "Петров", 34)))
                .addUser((new User("Сергей", "Сидоров", 31)))
                .addUser((new User("Иван", "Иванов", 63)))
                .addUser((new User("Артем", "Сидоров", 34)))
                .addUser((new User("Сергей", "Петров", 37)))
                .addUser((new User("Павел", "Сергеев", 21)))
        ;
        for (User user:personal) {
            System.out.println(user);
        }
        List<User> users = personal.getUsers();
        Collections.sort(users);
        System.out.println("-----");
        for (User user:users) {
            System.out.println(user);
        }

        User boss = new User("---Босс","Босой", 54);
        boss.setPersonal(personal);
        User littleBoss = new User("---Почибосс", "Небосый",25);
        personal.addUser(littleBoss);
        littleBoss.setPersonal(new Personal().addUser(new User("Федор", "Федоров", 33)));
        System.out.println("=========");
        Company company = new Company(boss);
        for (User user:company) {
            System.out.println(user);

        }

        User middleBoss = new User("---Артем", "Артемов", 25);
        personal.addUser(middleBoss);
        middleBoss.setPersonal(new Personal()
                .addUser(new User("Антон", "Антонов", 20))
                .addUser(new User("Андрей", "Андреев", 20)));
        System.out.println("----------");
        for (User user: company) {
            System.out.println(user);
        }
    }

}