package estm.dsic.jee.rest.business;

import estm.dsic.jee.rest.models.Note;

public interface INoteServices {

     boolean create(Note note);
     boolean delete(Long id);
    
} 
