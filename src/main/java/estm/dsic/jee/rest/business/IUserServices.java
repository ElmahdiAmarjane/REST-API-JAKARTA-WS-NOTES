package estm.dsic.jee.rest.business;

import java.util.List;

import estm.dsic.jee.rest.models.User;

public interface IUserServices {

    User auth(User user);
    boolean create(User user);
    boolean validateUser(boolean validate,User user);
    boolean deleteUser(User user);
    boolean updateUser(User user, String email);
    List<User> getAllUsers();
}
