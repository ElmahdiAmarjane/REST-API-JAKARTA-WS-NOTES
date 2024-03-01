package estm.dsic.jee.rest.dal;

import estm.dsic.jee.rest.models.User;

public interface Repository<T,I>{
     
       boolean create(T entity);
       User auth(T entity);
       User find(I index);
       boolean delete(I index);
       boolean update(T entity , I index);
      // boolean validateUser(I index);
}
