package estm.dsic.jee.rest.business;

import estm.dsic.jee.rest.models.User;

public interface IUserServices {

    User auth(User user);
    boolean create(User user);
    boolean validateUser(boolean validate,User user);

}
