package proxy.implementation_2.dao.interfaces;

import proxy.implementation_2.domain.User;

public interface UserDAO {
    User saveUser(User user);

    String getListOfUsers();

    String getUserById(long id);
}
