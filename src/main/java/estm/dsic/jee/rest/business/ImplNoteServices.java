package estm.dsic.jee.rest.business;

import java.io.Serializable;

import estm.dsic.jee.rest.dal.NoteDao;
import estm.dsic.jee.rest.models.Note;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ImplNoteServices implements INoteServices,Serializable {
     @Inject
       private NoteDao noteDao;
    @Override
    public boolean create(Note note) {
       return  noteDao.create(note);
    }
    
}
