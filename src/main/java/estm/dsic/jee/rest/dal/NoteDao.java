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
       String query = "DELETE FROM notes where id = ?";
         try(Connection connection = dataSource.getConnection()) {
              PreparedStatement preparedStatement=connection.prepareStatement(query);
               preparedStatement.setLong(1, index);
               preparedStatement.executeUpdate();
               return true;
         } catch (Exception e) {
          System.out.println(e);
         }
        return false;
    }

    
    public boolean updateNote(Note entity) {
         String query = "UPDATE notes SET body = ? , subject = ? where id = ?";
         try (Connection connection = dataSource.getConnection()){
             PreparedStatement preparedStatement= connection.prepareStatement(query);
                 preparedStatement.setString(1, entity.getBody());
                 preparedStatement.setString(2, entity.getSubject());
                 preparedStatement.setLong(3, entity.getId());
                preparedStatement.executeUpdate();
                return true;
            } catch (Exception e) {
          System.out.println(e);
         }
       return true;
    }

    @Override
    public List<Note> getAll() {
        return null ; 
    }

    @Override
    public boolean update(Note entity, Long index) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
