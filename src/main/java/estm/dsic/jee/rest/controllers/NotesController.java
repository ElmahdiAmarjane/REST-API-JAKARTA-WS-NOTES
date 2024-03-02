package estm.dsic.jee.rest.controllers;


import estm.dsic.jee.rest.business.INoteServices;
import estm.dsic.jee.rest.models.Note;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/notes")
public class NotesController {
    @Inject
       INoteServices noteServices;

    @Path("/addNote")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean create(Note note){
          return noteServices.create(note);
    }
    @Path("/deleteNote")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean delete(Note note){
          return noteServices.delete(note.getId());
    }

}
