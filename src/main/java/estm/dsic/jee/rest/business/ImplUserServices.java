package estm.dsic.jee.rest.business;

import java.io.Serializable;

import estm.dsic.jee.rest.dal.UserDao;
import estm.dsic.jee.rest.models.User;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ImplUserServices implements IUserServices, Serializable {

    @Inject
    private UserDao userDao;

    @Override
    public User auth(User user) {
        return userDao.auth(user);
    }

    @Override
    public boolean create(User user) {
        return userDao.create(user);
    }

    @Override
    public boolean validateUser(boolean validate,User user) {
        return userDao.validateUser(validate,user.getEmail());
    }

    @Override
    public boolean deleteUser(User user) {
          return userDao.delete(user.getEmail());
    }

    @Override
    public boolean updateUser(User user, String email) {
           return userDao.update(user, email);
    }
}
