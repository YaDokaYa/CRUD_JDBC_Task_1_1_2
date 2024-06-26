package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        util.getConnection();
        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//
//        List<User> users = new ArrayList<>();
//        users.add(new User("Piotr", "Piotrov", (byte) 45));
//        users.add(new User("Ivan", "Piotrov", (byte) 44));
//        users.add(new User("Gavrik", "Piotrov", (byte) 43));
//        users.add(new User("Pavlik", "Piotrov", (byte) 42));
//
//        for (User us : users) {
//            userService.saveUser(us.getName(), us.getLastName(), (byte) us.getAge());
//            System.out.println("User с именем – " + us.getName() + " добавлен в базу данных");
//        }
//   userService.cleanUsersTable();
        List<User> usersTable = userService.getAllUsers();
        for (User us : usersTable) {
            System.out.println(us);
        }

//userService.removeUserById(4);
//userService.dropUsersTable();

    }
}
