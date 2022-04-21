package proxy.implementation_2;

import proxy.implementation_2.dao.simpleProxy.SimpleUserDaoImplProxy;
import proxy.implementation_2.domain.User;
import proxy.implementation_2.security.SecurityMode;

public class Main {

    public static void main(String[] args) {
        User user = new User("User1", "qwerty");
        User user2 = new User("User2", "1234567");

        SimpleUserDaoImplProxy simpleUserDaoProxy = new SimpleUserDaoImplProxy();

        simpleUserDaoProxy.saveUser(user);
        simpleUserDaoProxy.saveUser(user2);

        System.out.println(simpleUserDaoProxy.getUserById(SecurityMode.PROTECTED, 1l));
        System.out.println(simpleUserDaoProxy.getUserById(SecurityMode.FREE, 2l));

    }
}