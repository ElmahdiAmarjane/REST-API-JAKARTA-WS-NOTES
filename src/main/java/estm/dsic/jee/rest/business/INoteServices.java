package estm.dsic.jee.rest.business;

import java.util.List;

import estm.dsic.jee.rest.models.Note;

public interface INoteServices {

     boolean create(Note note);
     boolean delete(Long id);
     boolean update(Note note);
     List<Note> getAll(int iduser);
    
} 
