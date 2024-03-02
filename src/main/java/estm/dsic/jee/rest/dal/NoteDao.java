package estm.dsic.jee.rest.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import estm.dsic.jee.rest.models.Note;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NoteDao implements Repository<Note,Long> {
       @Resource(lookup = "jdbc/db_notes")
          private DataSource dataSource ;
    @Override
    public boolean create(Note entity) {
             String query = "INSERT INTO notes (subject , body ,iduser) VALUES (?,?,?)";
          try(Connection connection = dataSource.getConnection()) {
               PreparedStatement preparedStatement= connection.prepareStatement(query);
               preparedStatement.setString(1, entity.getSubject());
               preparedStatement.setString(2, entity.getBody());
                preparedStatement.setInt(3,entity.getIduser());
                preparedStatement.executeUpdate();
                  return true;
          } catch (Exception e) {
            System.out.println(e);
          }
         return false;
    }

    @Override
    public Note find(Long index) {
   return null;

    }

    @Override
    public boolean delete(Long index) {
        return true;
    }

    @Override
    public boolean update(Note entity, Long index) {
       return true;
    }

    @Override
    public List<Note> getAll() {
        return null ; 
    }
    
}
